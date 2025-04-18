package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.amr.AmrExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.FlvExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.Mp4Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.Ac3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.AdtsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.wav.WavExtractor;
import java.lang.reflect.Constructor;

/* loaded from: classes4.dex */
public final class DefaultExtractorsFactory implements ExtractorsFactory {
    private static final Constructor<? extends Extractor> FLAC_EXTRACTOR_CONSTRUCTOR;
    private int fragmentedMp4Flags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private int tsMode = 1;

    static {
        Constructor<? extends Extractor> constructor;
        try {
            constructor = Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        FLAC_EXTRACTOR_CONSTRUCTOR = constructor;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
    public final synchronized Extractor[] createExtractors() {
        int i10;
        Extractor[] extractorArr;
        Constructor<? extends Extractor> constructor = FLAC_EXTRACTOR_CONSTRUCTOR;
        if (constructor == null) {
            i10 = 12;
        } else {
            i10 = 13;
        }
        extractorArr = new Extractor[i10];
        extractorArr[0] = new MatroskaExtractor(this.matroskaFlags);
        extractorArr[1] = new FragmentedMp4Extractor(this.fragmentedMp4Flags);
        extractorArr[2] = new Mp4Extractor(this.mp4Flags);
        extractorArr[3] = new Mp3Extractor(this.mp3Flags);
        extractorArr[4] = new AdtsExtractor();
        extractorArr[5] = new Ac3Extractor();
        extractorArr[6] = new TsExtractor(this.tsMode, this.tsFlags);
        extractorArr[7] = new FlvExtractor();
        extractorArr[8] = new OggExtractor();
        extractorArr[9] = new PsExtractor();
        extractorArr[10] = new WavExtractor();
        extractorArr[11] = new AmrExtractor();
        if (constructor != null) {
            try {
                extractorArr[12] = constructor.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
        return extractorArr;
    }

    public final synchronized DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int i10) {
        this.fragmentedMp4Flags = i10;
        return this;
    }

    public final synchronized DefaultExtractorsFactory setMatroskaExtractorFlags(int i10) {
        this.matroskaFlags = i10;
        return this;
    }

    public final synchronized DefaultExtractorsFactory setMp3ExtractorFlags(int i10) {
        this.mp3Flags = i10;
        return this;
    }

    public final synchronized DefaultExtractorsFactory setMp4ExtractorFlags(int i10) {
        this.mp4Flags = i10;
        return this;
    }

    public final synchronized DefaultExtractorsFactory setTsExtractorFlags(int i10) {
        this.tsFlags = i10;
        return this;
    }

    public final synchronized DefaultExtractorsFactory setTsExtractorMode(int i10) {
        this.tsMode = i10;
        return this;
    }
}
