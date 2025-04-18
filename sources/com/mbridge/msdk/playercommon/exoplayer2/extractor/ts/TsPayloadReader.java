package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public interface TsPayloadReader {

    /* loaded from: classes4.dex */
    public static final class DvbSubtitleInfo {
        public final byte[] initializationData;
        public final String language;
        public final int type;

        public DvbSubtitleInfo(String str, int i10, byte[] bArr) {
            this.language = str;
            this.type = i10;
            this.initializationData = bArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class EsInfo {
        public final byte[] descriptorBytes;
        public final List<DvbSubtitleInfo> dvbSubtitleInfos;
        public final String language;
        public final int streamType;

        public EsInfo(int i10, String str, List<DvbSubtitleInfo> list, byte[] bArr) {
            List<DvbSubtitleInfo> unmodifiableList;
            this.streamType = i10;
            this.language = str;
            if (list == null) {
                unmodifiableList = Collections.emptyList();
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.dvbSubtitleInfos = unmodifiableList;
            this.descriptorBytes = bArr;
        }
    }

    /* loaded from: classes4.dex */
    public interface Factory {
        SparseArray<TsPayloadReader> createInitialPayloadReaders();

        TsPayloadReader createPayloadReader(int i10, EsInfo esInfo);
    }

    /* loaded from: classes4.dex */
    public static final class TrackIdGenerator {
        private static final int ID_UNSET = Integer.MIN_VALUE;
        private final int firstTrackId;
        private String formatId;
        private final String formatIdPrefix;
        private int trackId;
        private final int trackIdIncrement;

        public TrackIdGenerator(int i10, int i11) {
            this(Integer.MIN_VALUE, i10, i11);
        }

        private void maybeThrowUninitializedError() {
            if (this.trackId != Integer.MIN_VALUE) {
            } else {
                throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
            }
        }

        public final void generateNewId() {
            int i10;
            int i11 = this.trackId;
            if (i11 == Integer.MIN_VALUE) {
                i10 = this.firstTrackId;
            } else {
                i10 = i11 + this.trackIdIncrement;
            }
            this.trackId = i10;
            this.formatId = this.formatIdPrefix + this.trackId;
        }

        public final String getFormatId() {
            maybeThrowUninitializedError();
            return this.formatId;
        }

        public final int getTrackId() {
            maybeThrowUninitializedError();
            return this.trackId;
        }

        public TrackIdGenerator(int i10, int i11, int i12) {
            String str;
            if (i10 != Integer.MIN_VALUE) {
                str = i10 + "/";
            } else {
                str = "";
            }
            this.formatIdPrefix = str;
            this.firstTrackId = i11;
            this.trackIdIncrement = i12;
            this.trackId = Integer.MIN_VALUE;
        }
    }

    void consume(ParsableByteArray parsableByteArray, boolean z10) throws ParserException;

    void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TrackIdGenerator trackIdGenerator);

    void seek();
}
