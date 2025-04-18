package com.bytedance.adsdk.Sg.wN;

import android.util.JsonReader;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public class AlY {
    public static com.bytedance.adsdk.Sg.tN.YFl.DSW AlY(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.DSW(YFl(jsonReader, dsw, Sco.YFl));
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.YFl DSW(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.YFl(YFl(jsonReader, dsw, DSW.YFl));
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.AlY Sg(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.AlY(YFl(jsonReader, dsw, Wwa.YFl));
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.Sg YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        return YFl(jsonReader, dsw, true);
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.vc tN(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.vc(wXo.YFl(jsonReader, dsw, com.bytedance.adsdk.Sg.vc.vc.YFl(), Cfr.YFl, true));
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.nc vc(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.nc(YFl(jsonReader, com.bytedance.adsdk.Sg.vc.vc.YFl(), dsw, NjR.YFl));
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.qsH wN(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.qsH(YFl(jsonReader, com.bytedance.adsdk.Sg.vc.vc.YFl(), dsw, GS.YFl));
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.Sg YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, boolean z10) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.Sg(YFl(jsonReader, z10 ? com.bytedance.adsdk.Sg.vc.vc.YFl() : 1.0f, dsw, YoT.YFl));
    }

    public static com.bytedance.adsdk.Sg.tN.YFl.tN YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, int i10) throws IOException {
        return new com.bytedance.adsdk.Sg.tN.YFl.tN(YFl(jsonReader, dsw, new EH(i10)));
    }

    private static <T> List<com.bytedance.adsdk.Sg.DSW.YFl<T>> YFl(JsonReader jsonReader, com.bytedance.adsdk.Sg.DSW dsw, zG<T> zGVar) throws IOException {
        return wXo.YFl(jsonReader, dsw, 1.0f, zGVar, false);
    }

    private static <T> List<com.bytedance.adsdk.Sg.DSW.YFl<T>> YFl(JsonReader jsonReader, float f10, com.bytedance.adsdk.Sg.DSW dsw, zG<T> zGVar) throws IOException {
        return wXo.YFl(jsonReader, dsw, f10, zGVar, false);
    }
}
