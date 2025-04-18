package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzdtn {
    public static final zzgax zza;
    public static final zzgax zzb;
    private final String zzc;
    private final zzdtm zzd;
    private final zzdtm zze;

    static {
        zzdtm zzdtmVar = zzdtm.PUBLIC_API_CALL;
        zzdtm zzdtmVar2 = zzdtm.PUBLIC_API_CALLBACK;
        zzdtn zzdtnVar = new zzdtn("tqgt", zzdtmVar, zzdtmVar2);
        zzdtm zzdtmVar3 = zzdtm.DYNAMITE_ENTER;
        zzdtn zzdtnVar2 = new zzdtn("l.dl", zzdtmVar, zzdtmVar3);
        zzdtm zzdtmVar4 = zzdtm.CLIENT_SIGNALS_START;
        zzdtn zzdtnVar3 = new zzdtn("l.rcc", zzdtmVar3, zzdtmVar4);
        zzdtm zzdtmVar5 = zzdtm.CLIENT_SIGNALS_END;
        zzdtn zzdtnVar4 = new zzdtn("l.cs", zzdtmVar4, zzdtmVar5);
        zzdtm zzdtmVar6 = zzdtm.SERVICE_CONNECTED;
        zzdtn zzdtnVar5 = new zzdtn("l.cts", zzdtmVar5, zzdtmVar6);
        zzdtm zzdtmVar7 = zzdtm.GMS_SIGNALS_START;
        zzdtm zzdtmVar8 = zzdtm.GMS_SIGNALS_END;
        zzdtn zzdtnVar6 = new zzdtn("l.gs", zzdtmVar7, zzdtmVar8);
        zzdtm zzdtmVar9 = zzdtm.GET_SIGNALS_SDKCORE_START;
        zzdtn zzdtnVar7 = new zzdtn("l.jse", zzdtmVar8, zzdtmVar9);
        zzdtm zzdtmVar10 = zzdtm.GET_SIGNALS_SDKCORE_END;
        zzdtn zzdtnVar8 = new zzdtn("l.gs-sdkcore", zzdtmVar9, zzdtmVar10);
        zzdtn zzdtnVar9 = new zzdtn("l.gs-pp", zzdtmVar10, zzdtmVar2);
        zzdtm zzdtmVar11 = zzdtm.RENDERING_START;
        zzdtn zzdtnVar10 = new zzdtn("l.render", zzdtmVar11, zzdtmVar2);
        zzdtm zzdtmVar12 = zzdtm.RENDERING_WEBVIEW_CREATION_START;
        zzdtn zzdtnVar11 = new zzdtn("l.render.pre", zzdtmVar11, zzdtmVar12);
        zzdtm zzdtmVar13 = zzdtm.RENDERING_WEBVIEW_CREATION_END;
        zzdtn zzdtnVar12 = new zzdtn("l.render.wvc", zzdtmVar12, zzdtmVar13);
        zzdtm zzdtmVar14 = zzdtm.RENDERING_AD_COMPONENT_CREATION_END;
        zzdtn zzdtnVar13 = new zzdtn("l.render.acc", zzdtmVar13, zzdtmVar14);
        zzdtm zzdtmVar15 = zzdtm.RENDERING_CONFIGURE_WEBVIEW_START;
        zzdtm zzdtmVar16 = zzdtm.RENDERING_CONFIGURE_WEBVIEW_END;
        zzdtn zzdtnVar14 = new zzdtn("l.render.cfg-wv", zzdtmVar15, zzdtmVar16);
        zzdtm zzdtmVar17 = zzdtm.RENDERING_WEBVIEW_LOAD_HTML_START;
        zzdtm zzdtmVar18 = zzdtm.RENDERING_WEBVIEW_LOAD_HTML_END;
        zza = zzgax.zzt(zzdtnVar, zzdtnVar2, zzdtnVar3, zzdtnVar4, zzdtnVar5, zzdtnVar6, zzdtnVar7, zzdtnVar8, zzdtnVar9, zzdtnVar10, zzdtnVar11, zzdtnVar12, zzdtnVar13, zzdtnVar14, new zzdtn("l.render.wvlh", zzdtmVar17, zzdtmVar18), new zzdtn("l.render.post", zzdtmVar18, zzdtmVar2));
        zzdtn zzdtnVar15 = new zzdtn("l.al", zzdtmVar, zzdtmVar2);
        zzdtn zzdtnVar16 = new zzdtn("l.al2", zzdtmVar3, zzdtmVar2);
        zzdtn zzdtnVar17 = new zzdtn("l.dl", zzdtmVar, zzdtmVar3);
        zzdtn zzdtnVar18 = new zzdtn("l.rcc", zzdtmVar3, zzdtmVar4);
        zzdtn zzdtnVar19 = new zzdtn("l.cs", zzdtmVar4, zzdtmVar5);
        zzdtn zzdtnVar20 = new zzdtn("l.cts", zzdtmVar5, zzdtmVar6);
        zzdtn zzdtnVar21 = new zzdtn("l.gs", zzdtmVar7, zzdtmVar8);
        zzdtm zzdtmVar19 = zzdtm.GET_AD_DICTIONARY_SDKCORE_START;
        zzdtn zzdtnVar22 = new zzdtn("l.jse", zzdtmVar8, zzdtmVar19);
        zzdtm zzdtmVar20 = zzdtm.GET_AD_DICTIONARY_SDKCORE_END;
        zzdtn zzdtnVar23 = new zzdtn("l.gad-js", zzdtmVar19, zzdtmVar20);
        zzdtm zzdtmVar21 = zzdtm.HTTP_RESPONSE_READY;
        zzdtn zzdtnVar24 = new zzdtn("l.http", zzdtmVar20, zzdtmVar21);
        zzdtm zzdtmVar22 = zzdtm.NORMALIZATION_AD_RESPONSE_START;
        zzdtn zzdtnVar25 = new zzdtn("l.jse-nml", zzdtmVar21, zzdtmVar22);
        zzdtm zzdtmVar23 = zzdtm.NORMALIZATION_AD_RESPONSE_END;
        zzdtn zzdtnVar26 = new zzdtn("l.nml-js", zzdtmVar22, zzdtmVar23);
        zzdtm zzdtmVar24 = zzdtm.BINDER_CALL_START;
        zzdtn zzdtnVar27 = new zzdtn("l.nml-gmsg", zzdtmVar23, zzdtmVar24);
        zzdtm zzdtmVar25 = zzdtm.SERVER_RESPONSE_PARSE_START;
        zzb = zzgax.zzt(zzdtnVar15, zzdtnVar16, zzdtnVar17, zzdtnVar18, zzdtnVar19, zzdtnVar20, zzdtnVar21, zzdtnVar22, zzdtnVar23, zzdtnVar24, zzdtnVar25, zzdtnVar26, zzdtnVar27, new zzdtn("l.binder", zzdtmVar24, zzdtmVar25), new zzdtn("l.sr", zzdtmVar25, zzdtmVar11), new zzdtn("l.render", zzdtmVar11, zzdtmVar2), new zzdtn("l.render.wvc", zzdtmVar12, zzdtmVar13), new zzdtn("l.render.acc", zzdtmVar13, zzdtmVar14), new zzdtn("l.render.cfg-wv", zzdtmVar15, zzdtmVar16), new zzdtn("l.render.pre", zzdtmVar11, zzdtmVar12), new zzdtn("l.render.post", zzdtmVar18, zzdtmVar2), new zzdtn("l.render.wvlh", zzdtmVar17, zzdtmVar18));
    }

    public zzdtn(String str, zzdtm zzdtmVar, zzdtm zzdtmVar2) {
        this.zzc = str;
        this.zzd = zzdtmVar;
        this.zze = zzdtmVar2;
    }

    public final zzdtm zza() {
        return this.zzd;
    }

    public final zzdtm zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzc;
    }
}
