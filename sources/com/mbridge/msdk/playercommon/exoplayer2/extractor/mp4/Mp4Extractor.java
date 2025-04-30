package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Atom;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.AtomParsers;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class Mp4Extractor implements Extractor, SeekMap {
    public static final int FLAG_WORKAROUND_IGNORE_EDIT_LISTS = 1;
    private static final long MAXIMUM_READ_AHEAD_BYTES_STREAM = 10485760;
    private static final long RELOAD_MINIMUM_SEEK_DISTANCE = 262144;
    private static final int STATE_READING_ATOM_HEADER = 0;
    private static final int STATE_READING_ATOM_PAYLOAD = 1;
    private static final int STATE_READING_SAMPLE = 2;
    private long[][] accumulatedSampleSizes;
    private ParsableByteArray atomData;
    private final ParsableByteArray atomHeader;
    private int atomHeaderBytesRead;
    private long atomSize;
    private int atomType;
    private final ArrayDeque<Atom.ContainerAtom> containerAtoms;
    private long durationUs;
    private ExtractorOutput extractorOutput;
    private int firstVideoTrackIndex;
    private final int flags;
    private boolean isQuickTime;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private int parserState;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private int sampleTrackIndex;
    private Mp4Track[] tracks;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Mp4Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new Mp4Extractor()};
        }
    };
    private static final int BRAND_QUICKTIME = Util.getIntegerCodeForString("qt  ");

    /* loaded from: classes3.dex */
    public @interface Flags {
    }

    /* loaded from: classes3.dex */
    public static final class Mp4Track {
        public int sampleIndex;
        public final TrackSampleTable sampleTable;
        public final Track track;
        public final TrackOutput trackOutput;

        public Mp4Track(Track track, TrackSampleTable trackSampleTable, TrackOutput trackOutput) {
            this.track = track;
            this.sampleTable = trackSampleTable;
            this.trackOutput = trackOutput;
        }
    }

    /* loaded from: classes3.dex */
    public @interface State {
    }

    public Mp4Extractor() {
        this(0);
    }

    private static long[][] calculateAccumulatedSampleSizes(Mp4Track[] mp4TrackArr) {
        long[][] jArr = new long[mp4TrackArr.length];
        int[] iArr = new int[mp4TrackArr.length];
        long[] jArr2 = new long[mp4TrackArr.length];
        boolean[] zArr = new boolean[mp4TrackArr.length];
        for (int i9 = 0; i9 < mp4TrackArr.length; i9++) {
            jArr[i9] = new long[mp4TrackArr[i9].sampleTable.sampleCount];
            jArr2[i9] = mp4TrackArr[i9].sampleTable.timestampsUs[0];
        }
        long j7 = 0;
        int i10 = 0;
        while (i10 < mp4TrackArr.length) {
            long j9 = Long.MAX_VALUE;
            int i11 = -1;
            for (int i12 = 0; i12 < mp4TrackArr.length; i12++) {
                if (!zArr[i12]) {
                    long j10 = jArr2[i12];
                    if (j10 <= j9) {
                        i11 = i12;
                        j9 = j10;
                    }
                }
            }
            int i13 = iArr[i11];
            long[] jArr3 = jArr[i11];
            jArr3[i13] = j7;
            TrackSampleTable trackSampleTable = mp4TrackArr[i11].sampleTable;
            j7 += trackSampleTable.sizes[i13];
            int i14 = i13 + 1;
            iArr[i11] = i14;
            if (i14 < jArr3.length) {
                jArr2[i11] = trackSampleTable.timestampsUs[i14];
            } else {
                zArr[i11] = true;
                i10++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j7) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j7);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            return trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j7);
        }
        return indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j7) {
        boolean z8;
        int i9 = -1;
        int i10 = -1;
        int i11 = 0;
        long j9 = Long.MAX_VALUE;
        boolean z9 = true;
        long j10 = Long.MAX_VALUE;
        boolean z10 = true;
        long j11 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i11 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i11];
            int i12 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i12 != trackSampleTable.sampleCount) {
                long j12 = trackSampleTable.offsets[i12];
                long j13 = this.accumulatedSampleSizes[i11][i12];
                long j14 = j12 - j7;
                if (j14 >= 0 && j14 < RELOAD_MINIMUM_SEEK_DISTANCE) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if ((!z8 && z10) || (z8 == z10 && j14 < j11)) {
                    z10 = z8;
                    j11 = j14;
                    i10 = i11;
                    j10 = j13;
                }
                if (j13 < j9) {
                    z9 = z8;
                    i9 = i11;
                    j9 = j13;
                }
            }
            i11++;
        }
        if (j9 == Long.MAX_VALUE || !z9 || j10 < j9 + MAXIMUM_READ_AHEAD_BYTES_STREAM) {
            return i10;
        }
        return i9;
    }

    private ArrayList<TrackSampleTable> getTrackSampleTables(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, boolean z8) throws ParserException {
        Track parseTrak;
        ArrayList<TrackSampleTable> arrayList = new ArrayList<>();
        for (int i9 = 0; i9 < containerAtom.containerChildren.size(); i9++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i9);
            if (containerAtom2.type == Atom.TYPE_trak && (parseTrak = AtomParsers.parseTrak(containerAtom2, containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd), C.TIME_UNSET, null, z8, this.isQuickTime)) != null) {
                TrackSampleTable parseStbl = AtomParsers.parseStbl(parseTrak, containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl), gaplessInfoHolder);
                if (parseStbl.sampleCount != 0) {
                    arrayList.add(parseStbl);
                }
            }
        }
        return arrayList;
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j7, long j9) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j7);
        if (synchronizationSampleIndex == -1) {
            return j9;
        }
        return Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j9);
    }

    private void processAtomEnded(long j7) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j7) {
            Atom.ContainerAtom pop = this.containerAtoms.pop();
            if (pop.type == Atom.TYPE_moov) {
                processMoovAtom(pop);
                this.containerAtoms.clear();
                this.parserState = 2;
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(pop);
            }
        }
        if (this.parserState != 2) {
            enterReadingAtomHeaderState();
        }
    }

    private static boolean processFtypAtom(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(8);
        if (parsableByteArray.readInt() == BRAND_QUICKTIME) {
            return true;
        }
        parsableByteArray.skipBytes(4);
        while (parsableByteArray.bytesLeft() > 0) {
            if (parsableByteArray.readInt() == BRAND_QUICKTIME) {
                return true;
            }
        }
        return false;
    }

    private void processMoovAtom(Atom.ContainerAtom containerAtom) throws ParserException {
        Metadata metadata;
        boolean z8;
        ArrayList<TrackSampleTable> trackSampleTables;
        ArrayList arrayList = new ArrayList();
        GaplessInfoHolder gaplessInfoHolder = new GaplessInfoHolder();
        Atom.LeafAtom leafAtomOfType = containerAtom.getLeafAtomOfType(Atom.TYPE_udta);
        if (leafAtomOfType != null) {
            metadata = AtomParsers.parseUdta(leafAtomOfType, this.isQuickTime);
            if (metadata != null) {
                gaplessInfoHolder.setFromMetadata(metadata);
            }
        } else {
            metadata = null;
        }
        int i9 = 1;
        int i10 = 0;
        if ((this.flags & 1) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        try {
            trackSampleTables = getTrackSampleTables(containerAtom, gaplessInfoHolder, z8);
        } catch (AtomParsers.UnhandledEditListException unused) {
            gaplessInfoHolder = new GaplessInfoHolder();
            trackSampleTables = getTrackSampleTables(containerAtom, gaplessInfoHolder, true);
        }
        int size = trackSampleTables.size();
        int i11 = -1;
        long j7 = C.TIME_UNSET;
        while (i10 < size) {
            TrackSampleTable trackSampleTable = trackSampleTables.get(i10);
            Track track = trackSampleTable.track;
            Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i10, track.type));
            Format copyWithMaxInputSize = track.format.copyWithMaxInputSize(trackSampleTable.maximumSize + 30);
            if (track.type == i9) {
                if (gaplessInfoHolder.hasGaplessInfo()) {
                    copyWithMaxInputSize = copyWithMaxInputSize.copyWithGaplessInfo(gaplessInfoHolder.encoderDelay, gaplessInfoHolder.encoderPadding);
                }
                if (metadata != null) {
                    copyWithMaxInputSize = copyWithMaxInputSize.copyWithMetadata(metadata);
                }
            }
            mp4Track.trackOutput.format(copyWithMaxInputSize);
            long j9 = track.durationUs;
            if (j9 == C.TIME_UNSET) {
                j9 = trackSampleTable.durationUs;
            }
            j7 = Math.max(j7, j9);
            if (track.type == 2 && i11 == -1) {
                i11 = arrayList.size();
            }
            arrayList.add(mp4Track);
            i10++;
            i9 = 1;
        }
        this.firstVideoTrackIndex = i11;
        this.durationUs = j7;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[arrayList.size()]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z8;
        boolean z9;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.data, 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j7 = this.atomSize;
        if (j7 == 1) {
            extractorInput.readFully(this.atomHeader.data, 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j7 == 0) {
            long length = extractorInput.getLength();
            if (length == -1 && !this.containerAtoms.isEmpty()) {
                length = this.containerAtoms.peek().endPosition;
            }
            if (length != -1) {
                this.atomSize = (length - extractorInput.getPosition()) + this.atomHeaderBytesRead;
            }
        }
        if (this.atomSize >= this.atomHeaderBytesRead) {
            if (shouldParseContainerAtom(this.atomType)) {
                long position = (extractorInput.getPosition() + this.atomSize) - this.atomHeaderBytesRead;
                this.containerAtoms.push(new Atom.ContainerAtom(this.atomType, position));
                if (this.atomSize == this.atomHeaderBytesRead) {
                    processAtomEnded(position);
                } else {
                    enterReadingAtomHeaderState();
                }
            } else if (shouldParseLeafAtom(this.atomType)) {
                if (this.atomHeaderBytesRead == 8) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Assertions.checkState(z8);
                if (this.atomSize <= 2147483647L) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                Assertions.checkState(z9);
                ParsableByteArray parsableByteArray = new ParsableByteArray((int) this.atomSize);
                this.atomData = parsableByteArray;
                System.arraycopy(this.atomHeader.data, 0, parsableByteArray.data, 0, 8);
                this.parserState = 1;
            } else {
                this.atomData = null;
                this.parserState = 1;
            }
            return true;
        }
        throw new ParserException("Atom size less than header length (unsupported).");
    }

    private boolean readAtomPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        boolean z8;
        long j7 = this.atomSize - this.atomHeaderBytesRead;
        long position = extractorInput.getPosition() + j7;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.data, this.atomHeaderBytesRead, (int) j7);
            if (this.atomType == Atom.TYPE_ftyp) {
                this.isQuickTime = processFtypAtom(this.atomData);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new Atom.LeafAtom(this.atomType, this.atomData));
            }
        } else if (j7 < RELOAD_MINIMUM_SEEK_DISTANCE) {
            extractorInput.skipFully((int) j7);
        } else {
            positionHolder.position = extractorInput.getPosition() + j7;
            z8 = true;
            processAtomEnded(position);
            if (!z8 && this.parserState != 2) {
                return true;
            }
            return false;
        }
        z8 = false;
        processAtomEnded(position);
        if (!z8) {
        }
        return false;
    }

    private int readSample(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        long position = extractorInput.getPosition();
        if (this.sampleTrackIndex == -1) {
            int trackIndexOfNextReadSample = getTrackIndexOfNextReadSample(position);
            this.sampleTrackIndex = trackIndexOfNextReadSample;
            if (trackIndexOfNextReadSample == -1) {
                return -1;
            }
        }
        Mp4Track mp4Track = this.tracks[this.sampleTrackIndex];
        TrackOutput trackOutput = mp4Track.trackOutput;
        int i9 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j7 = trackSampleTable.offsets[i9];
        int i10 = trackSampleTable.sizes[i9];
        long j9 = (j7 - position) + this.sampleBytesWritten;
        if (j9 >= 0 && j9 < RELOAD_MINIMUM_SEEK_DISTANCE) {
            if (mp4Track.track.sampleTransformation == 1) {
                j9 += 8;
                i10 -= 8;
            }
            extractorInput.skipFully((int) j9);
            int i11 = mp4Track.track.nalUnitLengthFieldLength;
            if (i11 == 0) {
                while (true) {
                    int i12 = this.sampleBytesWritten;
                    if (i12 >= i10) {
                        break;
                    }
                    int sampleData = trackOutput.sampleData(extractorInput, i10 - i12, false);
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                }
            } else {
                byte[] bArr = this.nalLength.data;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                int i13 = 4 - i11;
                while (this.sampleBytesWritten < i10) {
                    int i14 = this.sampleCurrentNalBytesRemaining;
                    if (i14 == 0) {
                        extractorInput.readFully(this.nalLength.data, i13, i11);
                        this.nalLength.setPosition(0);
                        this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                        i10 += i13;
                    } else {
                        int sampleData2 = trackOutput.sampleData(extractorInput, i14, false);
                        this.sampleBytesWritten += sampleData2;
                        this.sampleCurrentNalBytesRemaining -= sampleData2;
                    }
                }
            }
            int i15 = i10;
            TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
            trackOutput.sampleMetadata(trackSampleTable2.timestampsUs[i9], trackSampleTable2.flags[i9], i15, 0, null);
            mp4Track.sampleIndex++;
            this.sampleTrackIndex = -1;
            this.sampleBytesWritten = 0;
            this.sampleCurrentNalBytesRemaining = 0;
            return 0;
        }
        positionHolder.position = j7;
        return 1;
    }

    private static boolean shouldParseContainerAtom(int i9) {
        if (i9 != Atom.TYPE_moov && i9 != Atom.TYPE_trak && i9 != Atom.TYPE_mdia && i9 != Atom.TYPE_minf && i9 != Atom.TYPE_stbl && i9 != Atom.TYPE_edts) {
            return false;
        }
        return true;
    }

    private static boolean shouldParseLeafAtom(int i9) {
        if (i9 != Atom.TYPE_mdhd && i9 != Atom.TYPE_mvhd && i9 != Atom.TYPE_hdlr && i9 != Atom.TYPE_stsd && i9 != Atom.TYPE_stts && i9 != Atom.TYPE_stss && i9 != Atom.TYPE_ctts && i9 != Atom.TYPE_elst && i9 != Atom.TYPE_stsc && i9 != Atom.TYPE_stsz && i9 != Atom.TYPE_stz2 && i9 != Atom.TYPE_stco && i9 != Atom.TYPE_co64 && i9 != Atom.TYPE_tkhd && i9 != Atom.TYPE_ftyp && i9 != Atom.TYPE_udta) {
            return false;
        }
        return true;
    }

    private void updateSampleIndices(long j7) {
        for (Mp4Track mp4Track : this.tracks) {
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j7);
            if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j7);
            }
            mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j7) {
        long j9;
        long j10;
        int indexOfLaterOrEqualSynchronizationSample;
        Mp4Track[] mp4TrackArr = this.tracks;
        if (mp4TrackArr.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i9 = this.firstVideoTrackIndex;
        long j11 = -1;
        if (i9 != -1) {
            TrackSampleTable trackSampleTable = mp4TrackArr[i9].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j7);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            long j12 = trackSampleTable.timestampsUs[synchronizationSampleIndex];
            j9 = trackSampleTable.offsets[synchronizationSampleIndex];
            if (j12 < j7 && synchronizationSampleIndex < trackSampleTable.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j7)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j10 = trackSampleTable.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                j11 = trackSampleTable.offsets[indexOfLaterOrEqualSynchronizationSample];
            } else {
                j10 = -9223372036854775807L;
            }
            j7 = j12;
        } else {
            j9 = Long.MAX_VALUE;
            j10 = -9223372036854775807L;
        }
        int i10 = 0;
        while (true) {
            Mp4Track[] mp4TrackArr2 = this.tracks;
            if (i10 >= mp4TrackArr2.length) {
                break;
            }
            if (i10 != this.firstVideoTrackIndex) {
                TrackSampleTable trackSampleTable2 = mp4TrackArr2[i10].sampleTable;
                long maybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable2, j7, j9);
                if (j10 != C.TIME_UNSET) {
                    j11 = maybeAdjustSeekOffset(trackSampleTable2, j10, j11);
                }
                j9 = maybeAdjustSeekOffset;
            }
            i10++;
        }
        SeekPoint seekPoint = new SeekPoint(j7, j9);
        if (j10 == C.TIME_UNSET) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(j10, j11));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final boolean isSeekable() {
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException, InterruptedException {
        while (true) {
            int i9 = this.parserState;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 == 2) {
                        return readSample(extractorInput, positionHolder);
                    }
                    throw new IllegalStateException();
                }
                if (readAtomPayload(extractorInput, positionHolder)) {
                    return 1;
                }
            } else if (!readAtomHeader(extractorInput)) {
                return -1;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void release() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final void seek(long j7, long j9) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j7 == 0) {
            enterReadingAtomHeaderState();
        } else if (this.tracks != null) {
            updateSampleIndices(j9);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return Sniffer.sniffUnfragmented(extractorInput);
    }

    public Mp4Extractor(int i9) {
        this.flags = i9;
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleTrackIndex = -1;
    }
}
