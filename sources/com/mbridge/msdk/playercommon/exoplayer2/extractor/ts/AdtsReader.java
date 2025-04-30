package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.Log;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DummyTrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class AdtsReader implements ElementaryStreamReader {
    private static final int CRC_SIZE = 2;
    private static final int HEADER_SIZE = 5;
    private static final int ID3_HEADER_SIZE = 10;
    private static final byte[] ID3_IDENTIFIER = {73, 68, 51};
    private static final int ID3_SIZE_OFFSET = 6;
    private static final int MATCH_STATE_FF = 512;
    private static final int MATCH_STATE_I = 768;
    private static final int MATCH_STATE_ID = 1024;
    private static final int MATCH_STATE_START = 256;
    private static final int MATCH_STATE_VALUE_SHIFT = 8;
    private static final int STATE_FINDING_SAMPLE = 0;
    private static final int STATE_READING_ADTS_HEADER = 2;
    private static final int STATE_READING_ID3_HEADER = 1;
    private static final int STATE_READING_SAMPLE = 3;
    private static final String TAG = "AdtsReader";
    private final ParsableBitArray adtsScratch;
    private int bytesRead;
    private TrackOutput currentOutput;
    private long currentSampleDuration;
    private final boolean exposeId3;
    private String formatId;
    private boolean hasCrc;
    private boolean hasOutputFormat;
    private final ParsableByteArray id3HeaderBuffer;
    private TrackOutput id3Output;
    private final String language;
    private int matchState;
    private TrackOutput output;
    private long sampleDurationUs;
    private int sampleSize;
    private int state;
    private long timeUs;

    public AdtsReader(boolean z8) {
        this(z8, null);
    }

    private boolean continueRead(ParsableByteArray parsableByteArray, byte[] bArr, int i9) {
        int min = Math.min(parsableByteArray.bytesLeft(), i9 - this.bytesRead);
        parsableByteArray.readBytes(bArr, this.bytesRead, min);
        int i10 = this.bytesRead + min;
        this.bytesRead = i10;
        if (i10 == i9) {
            return true;
        }
        return false;
    }

    private void findNextSample(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.data;
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit) {
            int i9 = position + 1;
            byte b = bArr[position];
            int i10 = b & 255;
            int i11 = this.matchState;
            if (i11 == 512 && i10 >= 240 && i10 != 255) {
                boolean z8 = true;
                if ((b & 1) != 0) {
                    z8 = false;
                }
                this.hasCrc = z8;
                setReadingAdtsHeaderState();
                parsableByteArray.setPosition(i9);
                return;
            }
            int i12 = i11 | i10;
            if (i12 != 329) {
                if (i12 != 511) {
                    if (i12 != 836) {
                        if (i12 != 1075) {
                            if (i11 != 256) {
                                this.matchState = 256;
                            }
                        } else {
                            setReadingId3HeaderState();
                            parsableByteArray.setPosition(i9);
                            return;
                        }
                    } else {
                        this.matchState = MATCH_STATE_ID;
                    }
                } else {
                    this.matchState = 512;
                }
            } else {
                this.matchState = MATCH_STATE_I;
            }
            position = i9;
        }
        parsableByteArray.setPosition(position);
    }

    private void parseAdtsHeader() throws ParserException {
        this.adtsScratch.setPosition(0);
        if (!this.hasOutputFormat) {
            int i9 = 2;
            int readBits = this.adtsScratch.readBits(2) + 1;
            if (readBits != 2) {
                Log.w(TAG, "Detected audio object type: " + readBits + ", but assuming AAC LC.");
            } else {
                i9 = readBits;
            }
            int readBits2 = this.adtsScratch.readBits(4);
            this.adtsScratch.skipBits(1);
            byte[] buildAacAudioSpecificConfig = CodecSpecificDataUtil.buildAacAudioSpecificConfig(i9, readBits2, this.adtsScratch.readBits(3));
            Pair<Integer, Integer> parseAacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(buildAacAudioSpecificConfig);
            Format createAudioSampleFormat = Format.createAudioSampleFormat(this.formatId, MimeTypes.AUDIO_AAC, null, -1, -1, ((Integer) parseAacAudioSpecificConfig.second).intValue(), ((Integer) parseAacAudioSpecificConfig.first).intValue(), Collections.singletonList(buildAacAudioSpecificConfig), null, 0, this.language);
            this.sampleDurationUs = 1024000000 / createAudioSampleFormat.sampleRate;
            this.output.format(createAudioSampleFormat);
            this.hasOutputFormat = true;
        } else {
            this.adtsScratch.skipBits(10);
        }
        this.adtsScratch.skipBits(4);
        int readBits3 = this.adtsScratch.readBits(13);
        int i10 = readBits3 - 7;
        if (this.hasCrc) {
            i10 = readBits3 - 9;
        }
        setReadingSampleState(this.output, this.sampleDurationUs, 0, i10);
    }

    private void parseId3Header() {
        this.id3Output.sampleData(this.id3HeaderBuffer, 10);
        this.id3HeaderBuffer.setPosition(6);
        setReadingSampleState(this.id3Output, 0L, 10, this.id3HeaderBuffer.readSynchSafeInt() + 10);
    }

    private void readSample(ParsableByteArray parsableByteArray) {
        int min = Math.min(parsableByteArray.bytesLeft(), this.sampleSize - this.bytesRead);
        this.currentOutput.sampleData(parsableByteArray, min);
        int i9 = this.bytesRead + min;
        this.bytesRead = i9;
        int i10 = this.sampleSize;
        if (i9 == i10) {
            this.currentOutput.sampleMetadata(this.timeUs, 1, i10, 0, null);
            this.timeUs += this.currentSampleDuration;
            setFindingSampleState();
        }
    }

    private void setFindingSampleState() {
        this.state = 0;
        this.bytesRead = 0;
        this.matchState = 256;
    }

    private void setReadingAdtsHeaderState() {
        this.state = 2;
        this.bytesRead = 0;
    }

    private void setReadingId3HeaderState() {
        this.state = 1;
        this.bytesRead = ID3_IDENTIFIER.length;
        this.sampleSize = 0;
        this.id3HeaderBuffer.setPosition(0);
    }

    private void setReadingSampleState(TrackOutput trackOutput, long j7, int i9, int i10) {
        this.state = 3;
        this.bytesRead = i9;
        this.currentOutput = trackOutput;
        this.currentSampleDuration = j7;
        this.sampleSize = i10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) throws ParserException {
        int i9;
        while (parsableByteArray.bytesLeft() > 0) {
            int i10 = this.state;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 == 3) {
                            readSample(parsableByteArray);
                        }
                    } else {
                        if (this.hasCrc) {
                            i9 = 7;
                        } else {
                            i9 = 5;
                        }
                        if (continueRead(parsableByteArray, this.adtsScratch.data, i9)) {
                            parseAdtsHeader();
                        }
                    }
                } else if (continueRead(parsableByteArray, this.id3HeaderBuffer.data, 10)) {
                    parseId3Header();
                }
            } else {
                findNextSample(parsableByteArray);
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        if (this.exposeId3) {
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 4);
            this.id3Output = track;
            track.format(Format.createSampleFormat(trackIdGenerator.getFormatId(), MimeTypes.APPLICATION_ID3, null, -1, null));
            return;
        }
        this.id3Output = new DummyTrackOutput();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetFinished() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void packetStarted(long j7, boolean z8) {
        this.timeUs = j7;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public final void seek() {
        setFindingSampleState();
    }

    public AdtsReader(boolean z8, String str) {
        this.adtsScratch = new ParsableBitArray(new byte[7]);
        this.id3HeaderBuffer = new ParsableByteArray(Arrays.copyOf(ID3_IDENTIFIER, 10));
        setFindingSampleState();
        this.exposeId3 = z8;
        this.language = str;
    }
}
