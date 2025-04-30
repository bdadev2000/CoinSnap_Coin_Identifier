package com.mbridge.msdk.playercommon.exoplayer2.source.chunk;

import android.util.SparseArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.DummyTrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class ChunkExtractorWrapper implements ExtractorOutput {
    private final SparseArray<BindingTrackOutput> bindingTrackOutputs = new SparseArray<>();
    public final Extractor extractor;
    private boolean extractorInitialized;
    private final Format primaryTrackManifestFormat;
    private final int primaryTrackType;
    private Format[] sampleFormats;
    private SeekMap seekMap;
    private TrackOutputProvider trackOutputProvider;

    /* loaded from: classes3.dex */
    public static final class BindingTrackOutput implements TrackOutput {
        private final int id;
        private final Format manifestFormat;
        public Format sampleFormat;
        private TrackOutput trackOutput;
        private final int type;

        public BindingTrackOutput(int i9, int i10, Format format) {
            this.id = i9;
            this.type = i10;
            this.manifestFormat = format;
        }

        public final void bind(TrackOutputProvider trackOutputProvider) {
            if (trackOutputProvider == null) {
                this.trackOutput = new DummyTrackOutput();
                return;
            }
            TrackOutput track = trackOutputProvider.track(this.id, this.type);
            this.trackOutput = track;
            Format format = this.sampleFormat;
            if (format != null) {
                track.format(format);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final void format(Format format) {
            Format format2 = this.manifestFormat;
            if (format2 != null) {
                format = format.copyWithManifestFormatInfo(format2);
            }
            this.sampleFormat = format;
            this.trackOutput.format(format);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final int sampleData(ExtractorInput extractorInput, int i9, boolean z8) throws IOException, InterruptedException {
            return this.trackOutput.sampleData(extractorInput, i9, z8);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final void sampleMetadata(long j7, int i9, int i10, int i11, TrackOutput.CryptoData cryptoData) {
            this.trackOutput.sampleMetadata(j7, i9, i10, i11, cryptoData);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput
        public final void sampleData(ParsableByteArray parsableByteArray, int i9) {
            this.trackOutput.sampleData(parsableByteArray, i9);
        }
    }

    /* loaded from: classes3.dex */
    public interface TrackOutputProvider {
        TrackOutput track(int i9, int i10);
    }

    public ChunkExtractorWrapper(Extractor extractor, int i9, Format format) {
        this.extractor = extractor;
        this.primaryTrackType = i9;
        this.primaryTrackManifestFormat = format;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
        Format[] formatArr = new Format[this.bindingTrackOutputs.size()];
        for (int i9 = 0; i9 < this.bindingTrackOutputs.size(); i9++) {
            formatArr[i9] = this.bindingTrackOutputs.valueAt(i9).sampleFormat;
        }
        this.sampleFormats = formatArr;
    }

    public final Format[] getSampleFormats() {
        return this.sampleFormats;
    }

    public final SeekMap getSeekMap() {
        return this.seekMap;
    }

    public final void init(TrackOutputProvider trackOutputProvider, long j7) {
        this.trackOutputProvider = trackOutputProvider;
        if (!this.extractorInitialized) {
            this.extractor.init(this);
            if (j7 != C.TIME_UNSET) {
                this.extractor.seek(0L, j7);
            }
            this.extractorInitialized = true;
            return;
        }
        Extractor extractor = this.extractor;
        if (j7 == C.TIME_UNSET) {
            j7 = 0;
        }
        extractor.seek(0L, j7);
        for (int i9 = 0; i9 < this.bindingTrackOutputs.size(); i9++) {
            this.bindingTrackOutputs.valueAt(i9).bind(trackOutputProvider);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final void seekMap(SeekMap seekMap) {
        this.seekMap = seekMap;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i9, int i10) {
        boolean z8;
        Format format;
        BindingTrackOutput bindingTrackOutput = this.bindingTrackOutputs.get(i9);
        if (bindingTrackOutput == null) {
            if (this.sampleFormats == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            Assertions.checkState(z8);
            if (i10 == this.primaryTrackType) {
                format = this.primaryTrackManifestFormat;
            } else {
                format = null;
            }
            bindingTrackOutput = new BindingTrackOutput(i9, i10, format);
            bindingTrackOutput.bind(this.trackOutputProvider);
            this.bindingTrackOutputs.put(i9, bindingTrackOutput);
        }
        return bindingTrackOutput;
    }
}
