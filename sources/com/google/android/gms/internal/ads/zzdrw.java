package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdrw {
    public static final zzfzo zza;
    public static final zzfzo zzb;
    private final String zzc;
    private final zzdrv zzd;
    private final zzdrv zze;

    static {
        zzdrv zzdrvVar = zzdrv.PUBLIC_API_CALL;
        zzdrv zzdrvVar2 = zzdrv.PUBLIC_API_CALLBACK;
        zzdrw zzdrwVar = new zzdrw("tqgt", zzdrvVar, zzdrvVar2);
        zzdrv zzdrvVar3 = zzdrv.DYNAMITE_ENTER;
        zzdrw zzdrwVar2 = new zzdrw("l.dl", zzdrvVar, zzdrvVar3);
        zzdrv zzdrvVar4 = zzdrv.CLIENT_SIGNALS_START;
        zzdrw zzdrwVar3 = new zzdrw("l.rcc", zzdrvVar3, zzdrvVar4);
        zzdrv zzdrvVar5 = zzdrv.CLIENT_SIGNALS_END;
        zzdrw zzdrwVar4 = new zzdrw("l.cs", zzdrvVar4, zzdrvVar5);
        zzdrv zzdrvVar6 = zzdrv.SERVICE_CONNECTED;
        zzdrw zzdrwVar5 = new zzdrw("l.cts", zzdrvVar5, zzdrvVar6);
        zzdrv zzdrvVar7 = zzdrv.GMS_SIGNALS_START;
        zzdrv zzdrvVar8 = zzdrv.GMS_SIGNALS_END;
        zzdrw zzdrwVar6 = new zzdrw("l.gs", zzdrvVar7, zzdrvVar8);
        zzdrv zzdrvVar9 = zzdrv.GET_SIGNALS_SDKCORE_START;
        zzdrw zzdrwVar7 = new zzdrw("l.jse", zzdrvVar8, zzdrvVar9);
        zzdrv zzdrvVar10 = zzdrv.GET_SIGNALS_SDKCORE_END;
        zzdrw zzdrwVar8 = new zzdrw("l.gs-sdkcore", zzdrvVar9, zzdrvVar10);
        zzdrw zzdrwVar9 = new zzdrw("l.gs-pp", zzdrvVar10, zzdrvVar2);
        zzdrv zzdrvVar11 = zzdrv.RENDERING_START;
        zzdrw zzdrwVar10 = new zzdrw("l.render", zzdrvVar11, zzdrvVar2);
        zzdrv zzdrvVar12 = zzdrv.RENDERING_WEBVIEW_CREATION_START;
        zzdrw zzdrwVar11 = new zzdrw("l.render.pre", zzdrvVar11, zzdrvVar12);
        zzdrv zzdrvVar13 = zzdrv.RENDERING_WEBVIEW_CREATION_END;
        zzdrw zzdrwVar12 = new zzdrw("l.render.wvc", zzdrvVar12, zzdrvVar13);
        zzdrv zzdrvVar14 = zzdrv.RENDERING_AD_COMPONENT_CREATION_END;
        zzdrv zzdrvVar15 = zzdrv.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdrv zzdrvVar16 = zzdrv.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdrv zzdrvVar17 = zzdrv.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdrv zzdrvVar18 = zzdrv.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzfzo.zzt(zzdrwVar, zzdrwVar2, zzdrwVar3, zzdrwVar4, zzdrwVar5, zzdrwVar6, zzdrwVar7, zzdrwVar8, zzdrwVar9, zzdrwVar10, zzdrwVar11, zzdrwVar12, new zzdrw("l.render.acc", zzdrvVar13, zzdrvVar14), new zzdrw("l.render.cfg-wv", zzdrvVar15, zzdrvVar16), new zzdrw("l.render.wvlh", zzdrvVar17, zzdrvVar18), new zzdrw("l.render.post", zzdrvVar18, zzdrvVar2));
        zzdrw zzdrwVar13 = new zzdrw("l.al", zzdrvVar, zzdrvVar2);
        zzdrw zzdrwVar14 = new zzdrw("l.al2", zzdrvVar3, zzdrvVar2);
        zzdrw zzdrwVar15 = new zzdrw("l.dl", zzdrvVar, zzdrvVar3);
        zzdrw zzdrwVar16 = new zzdrw("l.rcc", zzdrvVar3, zzdrvVar4);
        zzdrw zzdrwVar17 = new zzdrw("l.cs", zzdrvVar4, zzdrvVar5);
        zzdrw zzdrwVar18 = new zzdrw("l.cts", zzdrvVar5, zzdrvVar6);
        zzdrw zzdrwVar19 = new zzdrw("l.gs", zzdrvVar7, zzdrvVar8);
        zzdrv zzdrvVar19 = zzdrv.GET_AD_DICTIONARY_SDKCORE_START;
        zzdrw zzdrwVar20 = new zzdrw("l.jse", zzdrvVar8, zzdrvVar19);
        zzdrv zzdrvVar20 = zzdrv.GET_AD_DICTIONARY_SDKCORE_END;
        zzdrw zzdrwVar21 = new zzdrw("l.gad-js", zzdrvVar19, zzdrvVar20);
        zzdrv zzdrvVar21 = zzdrv.HTTP_RESPONSE_READY;
        zzdrw zzdrwVar22 = new zzdrw("l.http", zzdrvVar20, zzdrvVar21);
        zzdrv zzdrvVar22 = zzdrv.NORMALIZATION_AD_RESPONSE_START;
        zzdrw zzdrwVar23 = new zzdrw("l.jse-nml", zzdrvVar21, zzdrvVar22);
        zzdrv zzdrvVar23 = zzdrv.NORMALIZATION_AD_RESPONSE_END;
        zzdrw zzdrwVar24 = new zzdrw("l.nml-js", zzdrvVar22, zzdrvVar23);
        zzdrv zzdrvVar24 = zzdrv.BINDER_CALL_START;
        zzdrv zzdrvVar25 = zzdrv.SERVER_RESPONSE_PARSE_START;
        zzb = zzfzo.zzt(zzdrwVar13, zzdrwVar14, zzdrwVar15, zzdrwVar16, zzdrwVar17, zzdrwVar18, zzdrwVar19, zzdrwVar20, zzdrwVar21, zzdrwVar22, zzdrwVar23, zzdrwVar24, new zzdrw("l.nml-gmsg", zzdrvVar23, zzdrvVar24), new zzdrw("l.binder", zzdrvVar24, zzdrvVar25), new zzdrw("l.sr", zzdrvVar25, zzdrvVar11), new zzdrw("l.render", zzdrvVar11, zzdrvVar2), new zzdrw("l.render.wvc", zzdrvVar12, zzdrvVar13), new zzdrw("l.render.acc", zzdrvVar13, zzdrvVar14), new zzdrw("l.render.cfg-wv", zzdrvVar15, zzdrvVar16), new zzdrw("l.render.pre", zzdrvVar11, zzdrvVar12), new zzdrw("l.render.post", zzdrvVar18, zzdrvVar2), new zzdrw("l.render.wvlh", zzdrvVar17, zzdrvVar18));
    }

    public zzdrw(String str, zzdrv zzdrvVar, zzdrv zzdrvVar2) {
        this.zzc = str;
        this.zzd = zzdrvVar;
        this.zze = zzdrvVar2;
    }

    public final zzdrv zza() {
        return this.zzd;
    }

    public final zzdrv zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
