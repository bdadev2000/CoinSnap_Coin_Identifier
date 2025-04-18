package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    public static final int MATCH_BYTE_RANGE = 100000;
    public static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 3;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private long end;
    private long endGranule;
    private final long endPosition;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private final long startPosition;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    /* loaded from: classes4.dex */
    public class OggSeekMap implements SeekMap {
        private OggSeekMap() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return DefaultOggSeeker.this.streamReader.convertGranuleToTime(DefaultOggSeeker.this.totalGranules);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j3) {
            if (j3 == 0) {
                return new SeekMap.SeekPoints(new SeekPoint(0L, DefaultOggSeeker.this.startPosition));
            }
            long convertTimeToGranule = DefaultOggSeeker.this.streamReader.convertTimeToGranule(j3);
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            return new SeekMap.SeekPoints(new SeekPoint(j3, defaultOggSeeker.getEstimatedPosition(defaultOggSeeker.startPosition, convertTimeToGranule, 30000L)));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(long j3, long j10, StreamReader streamReader, int i10, long j11) {
        boolean z10;
        if (j3 >= 0 && j10 > j3) {
            z10 = true;
        } else {
            z10 = false;
        }
        Assertions.checkArgument(z10);
        this.streamReader = streamReader;
        this.startPosition = j3;
        this.endPosition = j10;
        if (i10 == j10 - j3) {
            this.totalGranules = j11;
            this.state = 3;
        } else {
            this.state = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getEstimatedPosition(long j3, long j10, long j11) {
        long j12 = this.endPosition;
        long j13 = this.startPosition;
        long j14 = ((((j12 - j13) * j10) / this.totalGranules) - j11) + j3;
        if (j14 >= j13) {
            j13 = j14;
        }
        return j13 >= j12 ? j12 - 1 : j13;
    }

    public final long getNextSeekPosition(long j3, ExtractorInput extractorInput) throws IOException, InterruptedException {
        long j10 = 2;
        if (this.start == this.end) {
            return -(this.startGranule + 2);
        }
        long position = extractorInput.getPosition();
        if (!skipToNextPage(extractorInput, this.end)) {
            long j11 = this.start;
            if (j11 != position) {
                return j11;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        OggPageHeader oggPageHeader = this.pageHeader;
        long j12 = oggPageHeader.granulePosition;
        long j13 = j3 - j12;
        int i10 = oggPageHeader.headerSize + oggPageHeader.bodySize;
        if (j13 >= 0 && j13 <= 72000) {
            extractorInput.skipFully(i10);
            return -(this.pageHeader.granulePosition + 2);
        }
        if (j13 < 0) {
            this.end = position;
            this.endGranule = j12;
        } else {
            long j14 = i10;
            long position2 = extractorInput.getPosition() + j14;
            this.start = position2;
            this.startGranule = this.pageHeader.granulePosition;
            if ((this.end - position2) + j14 < 100000) {
                extractorInput.skipFully(i10);
                return -(this.startGranule + 2);
            }
        }
        long j15 = this.end;
        long j16 = this.start;
        if (j15 - j16 < 100000) {
            this.end = j16;
            return j16;
        }
        long j17 = i10;
        if (j13 > 0) {
            j10 = 1;
        }
        long position3 = extractorInput.getPosition();
        long j18 = this.end;
        long j19 = this.start;
        return Math.min(Math.max((((j18 - j19) * j13) / (this.endGranule - this.startGranule)) + (position3 - (j17 * j10)), j19), this.end - 1);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public final long read(ExtractorInput extractorInput) throws IOException, InterruptedException {
        int i10 = this.state;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                long j3 = this.targetGranule;
                long j10 = 0;
                if (j3 != 0) {
                    long nextSeekPosition = getNextSeekPosition(j3, extractorInput);
                    if (nextSeekPosition >= 0) {
                        return nextSeekPosition;
                    }
                    j10 = skipToPageOfGranule(extractorInput, this.targetGranule, -(nextSeekPosition + 2));
                }
                this.state = 3;
                return -(j10 + 2);
            }
        } else {
            long position = extractorInput.getPosition();
            this.positionBeforeSeekToEnd = position;
            this.state = 1;
            long j11 = this.endPosition - 65307;
            if (j11 > position) {
                return j11;
            }
        }
        this.totalGranules = readGranuleOfLastPage(extractorInput);
        this.state = 3;
        return this.positionBeforeSeekToEnd;
    }

    public final long readGranuleOfLastPage(ExtractorInput extractorInput) throws IOException, InterruptedException {
        skipToNextPage(extractorInput);
        this.pageHeader.reset();
        while ((this.pageHeader.type & 4) != 4 && extractorInput.getPosition() < this.endPosition) {
            this.pageHeader.populate(extractorInput, false);
            OggPageHeader oggPageHeader = this.pageHeader;
            extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
        }
        return this.pageHeader.granulePosition;
    }

    public final void resetSeeking() {
        this.start = this.startPosition;
        this.end = this.endPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }

    public final void skipToNextPage(ExtractorInput extractorInput) throws IOException, InterruptedException {
        if (!skipToNextPage(extractorInput, this.endPosition)) {
            throw new EOFException();
        }
    }

    public final long skipToPageOfGranule(ExtractorInput extractorInput, long j3, long j10) throws IOException, InterruptedException {
        this.pageHeader.populate(extractorInput, false);
        while (true) {
            OggPageHeader oggPageHeader = this.pageHeader;
            if (oggPageHeader.granulePosition < j3) {
                extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
                OggPageHeader oggPageHeader2 = this.pageHeader;
                long j11 = oggPageHeader2.granulePosition;
                oggPageHeader2.populate(extractorInput, false);
                j10 = j11;
            } else {
                extractorInput.resetPeekPosition();
                return j10;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public final long startSeek(long j3) {
        boolean z10;
        int i10 = this.state;
        if (i10 != 3 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        Assertions.checkArgument(z10);
        long j10 = 0;
        if (j3 != 0) {
            j10 = this.streamReader.convertTimeToGranule(j3);
        }
        this.targetGranule = j10;
        this.state = 2;
        resetSeeking();
        return this.targetGranule;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public final OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    public final boolean skipToNextPage(ExtractorInput extractorInput, long j3) throws IOException, InterruptedException {
        int i10;
        long min = Math.min(j3 + 3, this.endPosition);
        int i11 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i12 = 0;
            if (extractorInput.getPosition() + i11 > min && (i11 = (int) (min - extractorInput.getPosition())) < 4) {
                return false;
            }
            extractorInput.peekFully(bArr, 0, i11, false);
            while (true) {
                i10 = i11 - 3;
                if (i12 < i10) {
                    if (bArr[i12] == 79 && bArr[i12 + 1] == 103 && bArr[i12 + 2] == 103 && bArr[i12 + 3] == 83) {
                        extractorInput.skipFully(i12);
                        return true;
                    }
                    i12++;
                }
            }
            extractorInput.skipFully(i10);
        }
    }
}
