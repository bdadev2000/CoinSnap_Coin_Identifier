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

/* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    /* loaded from: classes4.dex */
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

    /* loaded from: classes4.dex */
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
        for (int i10 = 0; i10 < mp4TrackArr.length; i10++) {
            jArr[i10] = new long[mp4TrackArr[i10].sampleTable.sampleCount];
            jArr2[i10] = mp4TrackArr[i10].sampleTable.timestampsUs[0];
        }
        long j3 = 0;
        int i11 = 0;
        while (i11 < mp4TrackArr.length) {
            long j10 = Long.MAX_VALUE;
            int i12 = -1;
            for (int i13 = 0; i13 < mp4TrackArr.length; i13++) {
                if (!zArr[i13]) {
                    long j11 = jArr2[i13];
                    if (j11 <= j10) {
                        i12 = i13;
                        j10 = j11;
                    }
                }
            }
            int i14 = iArr[i12];
            long[] jArr3 = jArr[i12];
            jArr3[i14] = j3;
            TrackSampleTable trackSampleTable = mp4TrackArr[i12].sampleTable;
            j3 += trackSampleTable.sizes[i14];
            int i15 = i14 + 1;
            iArr[i12] = i15;
            if (i15 < jArr3.length) {
                jArr2[i12] = trackSampleTable.timestampsUs[i15];
            } else {
                zArr[i12] = true;
                i11++;
            }
        }
        return jArr;
    }

    private void enterReadingAtomHeaderState() {
        this.parserState = 0;
        this.atomHeaderBytesRead = 0;
    }

    private static int getSynchronizationSampleIndex(TrackSampleTable trackSampleTable, long j3) {
        int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j3);
        if (indexOfEarlierOrEqualSynchronizationSample == -1) {
            return trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j3);
        }
        return indexOfEarlierOrEqualSynchronizationSample;
    }

    private int getTrackIndexOfNextReadSample(long j3) {
        boolean z10;
        int i10 = -1;
        int i11 = -1;
        int i12 = 0;
        long j10 = Long.MAX_VALUE;
        boolean z11 = true;
        long j11 = Long.MAX_VALUE;
        boolean z12 = true;
        long j12 = Long.MAX_VALUE;
        while (true) {
            Mp4Track[] mp4TrackArr = this.tracks;
            if (i12 >= mp4TrackArr.length) {
                break;
            }
            Mp4Track mp4Track = mp4TrackArr[i12];
            int i13 = mp4Track.sampleIndex;
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            if (i13 != trackSampleTable.sampleCount) {
                long j13 = trackSampleTable.offsets[i13];
                long j14 = this.accumulatedSampleSizes[i12][i13];
                long j15 = j13 - j3;
                if (j15 >= 0 && j15 < RELOAD_MINIMUM_SEEK_DISTANCE) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if ((!z10 && z12) || (z10 == z12 && j15 < j12)) {
                    z12 = z10;
                    j12 = j15;
                    i11 = i12;
                    j11 = j14;
                }
                if (j14 < j10) {
                    z11 = z10;
                    i10 = i12;
                    j10 = j14;
                }
            }
            i12++;
        }
        if (j10 == Long.MAX_VALUE || !z11 || j11 < j10 + MAXIMUM_READ_AHEAD_BYTES_STREAM) {
            return i11;
        }
        return i10;
    }

    private ArrayList<TrackSampleTable> getTrackSampleTables(Atom.ContainerAtom containerAtom, GaplessInfoHolder gaplessInfoHolder, boolean z10) throws ParserException {
        Track parseTrak;
        ArrayList<TrackSampleTable> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < containerAtom.containerChildren.size(); i10++) {
            Atom.ContainerAtom containerAtom2 = containerAtom.containerChildren.get(i10);
            if (containerAtom2.type == Atom.TYPE_trak && (parseTrak = AtomParsers.parseTrak(containerAtom2, containerAtom.getLeafAtomOfType(Atom.TYPE_mvhd), C.TIME_UNSET, null, z10, this.isQuickTime)) != null) {
                TrackSampleTable parseStbl = AtomParsers.parseStbl(parseTrak, containerAtom2.getContainerAtomOfType(Atom.TYPE_mdia).getContainerAtomOfType(Atom.TYPE_minf).getContainerAtomOfType(Atom.TYPE_stbl), gaplessInfoHolder);
                if (parseStbl.sampleCount != 0) {
                    arrayList.add(parseStbl);
                }
            }
        }
        return arrayList;
    }

    private static long maybeAdjustSeekOffset(TrackSampleTable trackSampleTable, long j3, long j10) {
        int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j3);
        if (synchronizationSampleIndex == -1) {
            return j10;
        }
        return Math.min(trackSampleTable.offsets[synchronizationSampleIndex], j10);
    }

    private void processAtomEnded(long j3) throws ParserException {
        while (!this.containerAtoms.isEmpty() && this.containerAtoms.peek().endPosition == j3) {
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
        boolean z10;
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
        int i10 = 1;
        int i11 = 0;
        if ((this.flags & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        try {
            trackSampleTables = getTrackSampleTables(containerAtom, gaplessInfoHolder, z10);
        } catch (AtomParsers.UnhandledEditListException unused) {
            gaplessInfoHolder = new GaplessInfoHolder();
            trackSampleTables = getTrackSampleTables(containerAtom, gaplessInfoHolder, true);
        }
        int size = trackSampleTables.size();
        int i12 = -1;
        long j3 = C.TIME_UNSET;
        while (i11 < size) {
            TrackSampleTable trackSampleTable = trackSampleTables.get(i11);
            Track track = trackSampleTable.track;
            Mp4Track mp4Track = new Mp4Track(track, trackSampleTable, this.extractorOutput.track(i11, track.type));
            Format copyWithMaxInputSize = track.format.copyWithMaxInputSize(trackSampleTable.maximumSize + 30);
            if (track.type == i10) {
                if (gaplessInfoHolder.hasGaplessInfo()) {
                    copyWithMaxInputSize = copyWithMaxInputSize.copyWithGaplessInfo(gaplessInfoHolder.encoderDelay, gaplessInfoHolder.encoderPadding);
                }
                if (metadata != null) {
                    copyWithMaxInputSize = copyWithMaxInputSize.copyWithMetadata(metadata);
                }
            }
            mp4Track.trackOutput.format(copyWithMaxInputSize);
            long j10 = track.durationUs;
            if (j10 == C.TIME_UNSET) {
                j10 = trackSampleTable.durationUs;
            }
            j3 = Math.max(j3, j10);
            if (track.type == 2 && i12 == -1) {
                i12 = arrayList.size();
            }
            arrayList.add(mp4Track);
            i11++;
            i10 = 1;
        }
        this.firstVideoTrackIndex = i12;
        this.durationUs = j3;
        Mp4Track[] mp4TrackArr = (Mp4Track[]) arrayList.toArray(new Mp4Track[arrayList.size()]);
        this.tracks = mp4TrackArr;
        this.accumulatedSampleSizes = calculateAccumulatedSampleSizes(mp4TrackArr);
        this.extractorOutput.endTracks();
        this.extractorOutput.seekMap(this);
    }

    private boolean readAtomHeader(ExtractorInput extractorInput) throws IOException, InterruptedException {
        boolean z10;
        boolean z11;
        if (this.atomHeaderBytesRead == 0) {
            if (!extractorInput.readFully(this.atomHeader.data, 0, 8, true)) {
                return false;
            }
            this.atomHeaderBytesRead = 8;
            this.atomHeader.setPosition(0);
            this.atomSize = this.atomHeader.readUnsignedInt();
            this.atomType = this.atomHeader.readInt();
        }
        long j3 = this.atomSize;
        if (j3 == 1) {
            extractorInput.readFully(this.atomHeader.data, 8, 8);
            this.atomHeaderBytesRead += 8;
            this.atomSize = this.atomHeader.readUnsignedLongToLong();
        } else if (j3 == 0) {
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                Assertions.checkState(z10);
                if (this.atomSize <= 2147483647L) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Assertions.checkState(z11);
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
        boolean z10;
        long j3 = this.atomSize - this.atomHeaderBytesRead;
        long position = extractorInput.getPosition() + j3;
        ParsableByteArray parsableByteArray = this.atomData;
        if (parsableByteArray != null) {
            extractorInput.readFully(parsableByteArray.data, this.atomHeaderBytesRead, (int) j3);
            if (this.atomType == Atom.TYPE_ftyp) {
                this.isQuickTime = processFtypAtom(this.atomData);
            } else if (!this.containerAtoms.isEmpty()) {
                this.containerAtoms.peek().add(new Atom.LeafAtom(this.atomType, this.atomData));
            }
        } else if (j3 < RELOAD_MINIMUM_SEEK_DISTANCE) {
            extractorInput.skipFully((int) j3);
        } else {
            positionHolder.position = extractorInput.getPosition() + j3;
            z10 = true;
            processAtomEnded(position);
            if (!z10 && this.parserState != 2) {
                return true;
            }
            return false;
        }
        z10 = false;
        processAtomEnded(position);
        if (!z10) {
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
        int i10 = mp4Track.sampleIndex;
        TrackSampleTable trackSampleTable = mp4Track.sampleTable;
        long j3 = trackSampleTable.offsets[i10];
        int i11 = trackSampleTable.sizes[i10];
        long j10 = (j3 - position) + this.sampleBytesWritten;
        if (j10 >= 0 && j10 < RELOAD_MINIMUM_SEEK_DISTANCE) {
            if (mp4Track.track.sampleTransformation == 1) {
                j10 += 8;
                i11 -= 8;
            }
            extractorInput.skipFully((int) j10);
            int i12 = mp4Track.track.nalUnitLengthFieldLength;
            if (i12 == 0) {
                while (true) {
                    int i13 = this.sampleBytesWritten;
                    if (i13 >= i11) {
                        break;
                    }
                    int sampleData = trackOutput.sampleData(extractorInput, i11 - i13, false);
                    this.sampleBytesWritten += sampleData;
                    this.sampleCurrentNalBytesRemaining -= sampleData;
                }
            } else {
                byte[] bArr = this.nalLength.data;
                bArr[0] = 0;
                bArr[1] = 0;
                bArr[2] = 0;
                int i14 = 4 - i12;
                while (this.sampleBytesWritten < i11) {
                    int i15 = this.sampleCurrentNalBytesRemaining;
                    if (i15 == 0) {
                        extractorInput.readFully(this.nalLength.data, i14, i12);
                        this.nalLength.setPosition(0);
                        this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                        this.nalStartCode.setPosition(0);
                        trackOutput.sampleData(this.nalStartCode, 4);
                        this.sampleBytesWritten += 4;
                        i11 += i14;
                    } else {
                        int sampleData2 = trackOutput.sampleData(extractorInput, i15, false);
                        this.sampleBytesWritten += sampleData2;
                        this.sampleCurrentNalBytesRemaining -= sampleData2;
                    }
                }
            }
            TrackSampleTable trackSampleTable2 = mp4Track.sampleTable;
            trackOutput.sampleMetadata(trackSampleTable2.timestampsUs[i10], trackSampleTable2.flags[i10], i11, 0, null);
            mp4Track.sampleIndex++;
            this.sampleTrackIndex = -1;
            this.sampleBytesWritten = 0;
            this.sampleCurrentNalBytesRemaining = 0;
            return 0;
        }
        positionHolder.position = j3;
        return 1;
    }

    private static boolean shouldParseContainerAtom(int i10) {
        return i10 == Atom.TYPE_moov || i10 == Atom.TYPE_trak || i10 == Atom.TYPE_mdia || i10 == Atom.TYPE_minf || i10 == Atom.TYPE_stbl || i10 == Atom.TYPE_edts;
    }

    private static boolean shouldParseLeafAtom(int i10) {
        return i10 == Atom.TYPE_mdhd || i10 == Atom.TYPE_mvhd || i10 == Atom.TYPE_hdlr || i10 == Atom.TYPE_stsd || i10 == Atom.TYPE_stts || i10 == Atom.TYPE_stss || i10 == Atom.TYPE_ctts || i10 == Atom.TYPE_elst || i10 == Atom.TYPE_stsc || i10 == Atom.TYPE_stsz || i10 == Atom.TYPE_stz2 || i10 == Atom.TYPE_stco || i10 == Atom.TYPE_co64 || i10 == Atom.TYPE_tkhd || i10 == Atom.TYPE_ftyp || i10 == Atom.TYPE_udta;
    }

    private void updateSampleIndices(long j3) {
        for (Mp4Track mp4Track : this.tracks) {
            TrackSampleTable trackSampleTable = mp4Track.sampleTable;
            int indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfEarlierOrEqualSynchronizationSample(j3);
            if (indexOfEarlierOrEqualSynchronizationSample == -1) {
                indexOfEarlierOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j3);
            }
            mp4Track.sampleIndex = indexOfEarlierOrEqualSynchronizationSample;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public final SeekMap.SeekPoints getSeekPoints(long j3) {
        long j10;
        long j11;
        int indexOfLaterOrEqualSynchronizationSample;
        Mp4Track[] mp4TrackArr = this.tracks;
        if (mp4TrackArr.length == 0) {
            return new SeekMap.SeekPoints(SeekPoint.START);
        }
        int i10 = this.firstVideoTrackIndex;
        long j12 = -1;
        if (i10 != -1) {
            TrackSampleTable trackSampleTable = mp4TrackArr[i10].sampleTable;
            int synchronizationSampleIndex = getSynchronizationSampleIndex(trackSampleTable, j3);
            if (synchronizationSampleIndex == -1) {
                return new SeekMap.SeekPoints(SeekPoint.START);
            }
            long j13 = trackSampleTable.timestampsUs[synchronizationSampleIndex];
            j10 = trackSampleTable.offsets[synchronizationSampleIndex];
            if (j13 < j3 && synchronizationSampleIndex < trackSampleTable.sampleCount - 1 && (indexOfLaterOrEqualSynchronizationSample = trackSampleTable.getIndexOfLaterOrEqualSynchronizationSample(j3)) != -1 && indexOfLaterOrEqualSynchronizationSample != synchronizationSampleIndex) {
                j11 = trackSampleTable.timestampsUs[indexOfLaterOrEqualSynchronizationSample];
                j12 = trackSampleTable.offsets[indexOfLaterOrEqualSynchronizationSample];
            } else {
                j11 = -9223372036854775807L;
            }
            j3 = j13;
        } else {
            j10 = Long.MAX_VALUE;
            j11 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            Mp4Track[] mp4TrackArr2 = this.tracks;
            if (i11 >= mp4TrackArr2.length) {
                break;
            }
            if (i11 != this.firstVideoTrackIndex) {
                TrackSampleTable trackSampleTable2 = mp4TrackArr2[i11].sampleTable;
                long maybeAdjustSeekOffset = maybeAdjustSeekOffset(trackSampleTable2, j3, j10);
                if (j11 != C.TIME_UNSET) {
                    j12 = maybeAdjustSeekOffset(trackSampleTable2, j11, j12);
                }
                j10 = maybeAdjustSeekOffset;
            }
            i11++;
        }
        SeekPoint seekPoint = new SeekPoint(j3, j10);
        if (j11 == C.TIME_UNSET) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(j11, j12));
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
            int i10 = this.parserState;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
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
    public final void seek(long j3, long j10) {
        this.containerAtoms.clear();
        this.atomHeaderBytesRead = 0;
        this.sampleTrackIndex = -1;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        if (j3 == 0) {
            enterReadingAtomHeaderState();
        } else if (this.tracks != null) {
            updateSampleIndices(j10);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException, InterruptedException {
        return Sniffer.sniffUnfragmented(extractorInput);
    }

    public Mp4Extractor(int i10) {
        this.flags = i10;
        this.atomHeader = new ParsableByteArray(16);
        this.containerAtoms = new ArrayDeque<>();
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleTrackIndex = -1;
    }
}
