package com.vungle.ads.internal.network;

import a.AbstractC0325a;
import c7.C0631h0;
import c7.C0665z;
import c7.U0;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vungle.ads.C2137s;
import i8.C;
import i8.F;
import i8.G;
import i8.InterfaceC2372i;

/* loaded from: classes3.dex */
public final class B implements VungleApi {
    private static final String VUNGLE_VERSION = "7.1.0";
    private String appId;
    private final d7.b emptyResponseConverter;
    private final InterfaceC2372i okHttpClient;
    public static final A Companion = new A(null);
    private static final f8.b json = R2.b.a(z.INSTANCE);

    public B(InterfaceC2372i interfaceC2372i) {
        G7.j.e(interfaceC2372i, "okHttpClient");
        this.okHttpClient = interfaceC2372i;
        this.emptyResponseConverter = new d7.b();
    }

    private final i8.B defaultBuilder(String str, String str2) {
        i8.B b = new i8.B();
        b.f(str2);
        b.a(Command.HTTP_HEADER_USER_AGENT, str);
        b.a("Vungle-Version", VUNGLE_VERSION);
        b.a("Content-Type", "application/json");
        String str3 = this.appId;
        if (str3 != null) {
            b.a("X-Vungle-App-Id", str3);
        }
        return b;
    }

    private final i8.B defaultProtoBufBuilder(String str, String str2) {
        i8.B b = new i8.B();
        b.f(str2);
        b.a(Command.HTTP_HEADER_USER_AGENT, str);
        b.a("Vungle-Version", VUNGLE_VERSION);
        b.a("Content-Type", "application/x-protobuf");
        String str3 = this.appId;
        if (str3 != null) {
            b.a("X-Vungle-App-Id", str3);
        }
        return b;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2099a ads(String str, String str2, C0631h0 c0631h0) {
        G7.j.e(str, "ua");
        G7.j.e(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        G7.j.e(c0631h0, TtmlNode.TAG_BODY);
        try {
            f8.b bVar = json;
            String b = bVar.b(AbstractC0325a.q(bVar.b, G7.s.b(C0631h0.class)), c0631h0);
            i8.B defaultBuilder = defaultBuilder(str, str2);
            G.Companion.getClass();
            defaultBuilder.e(F.b(b, null));
            C b8 = defaultBuilder.b();
            i8.z zVar = (i8.z) this.okHttpClient;
            zVar.getClass();
            return new h(new m8.i(zVar, b8), new d7.e(G7.s.b(C0665z.class)));
        } catch (Exception unused) {
            C2137s.INSTANCE.logError$vungle_ads_release(101, "Error with url: ".concat(str2), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2099a config(String str, String str2, C0631h0 c0631h0) {
        G7.j.e(str, "ua");
        G7.j.e(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        G7.j.e(c0631h0, TtmlNode.TAG_BODY);
        try {
            f8.b bVar = json;
            String b = bVar.b(AbstractC0325a.q(bVar.b, G7.s.b(C0631h0.class)), c0631h0);
            i8.B defaultBuilder = defaultBuilder(str, str2);
            G.Companion.getClass();
            defaultBuilder.e(F.b(b, null));
            C b8 = defaultBuilder.b();
            i8.z zVar = (i8.z) this.okHttpClient;
            zVar.getClass();
            return new h(new m8.i(zVar, b8), new d7.e(G7.s.b(U0.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final InterfaceC2372i getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2099a pingTPAT(String str, String str2) {
        G7.j.e(str, "ua");
        G7.j.e(str2, "url");
        i8.t tVar = new i8.t();
        tVar.d(null, str2);
        i8.B defaultBuilder = defaultBuilder(str, tVar.a().f().a().f20891i);
        defaultBuilder.d("GET", null);
        C b = defaultBuilder.b();
        i8.z zVar = (i8.z) this.okHttpClient;
        zVar.getClass();
        return new h(new m8.i(zVar, b), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2099a ri(String str, String str2, C0631h0 c0631h0) {
        G7.j.e(str, "ua");
        G7.j.e(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        G7.j.e(c0631h0, TtmlNode.TAG_BODY);
        try {
            f8.b bVar = json;
            String b = bVar.b(AbstractC0325a.q(bVar.b, G7.s.b(C0631h0.class)), c0631h0);
            i8.B defaultBuilder = defaultBuilder(str, str2);
            G.Companion.getClass();
            defaultBuilder.e(F.b(b, null));
            C b8 = defaultBuilder.b();
            i8.z zVar = (i8.z) this.okHttpClient;
            zVar.getClass();
            return new h(new m8.i(zVar, b8), this.emptyResponseConverter);
        } catch (Exception unused) {
            C2137s.INSTANCE.logError$vungle_ads_release(101, "Error with url: ".concat(str2), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2099a sendAdMarkup(String str, G g9) {
        G7.j.e(str, "url");
        G7.j.e(g9, "requestBody");
        i8.t tVar = new i8.t();
        tVar.d(null, str);
        i8.B defaultBuilder = defaultBuilder("debug", tVar.a().f().a().f20891i);
        defaultBuilder.e(g9);
        C b = defaultBuilder.b();
        i8.z zVar = (i8.z) this.okHttpClient;
        zVar.getClass();
        return new h(new m8.i(zVar, b), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2099a sendErrors(String str, String str2, G g9) {
        G7.j.e(str, "ua");
        G7.j.e(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        G7.j.e(g9, "requestBody");
        i8.t tVar = new i8.t();
        tVar.d(null, str2);
        i8.B defaultProtoBufBuilder = defaultProtoBufBuilder(str, tVar.a().f().a().f20891i);
        defaultProtoBufBuilder.e(g9);
        C b = defaultProtoBufBuilder.b();
        i8.z zVar = (i8.z) this.okHttpClient;
        zVar.getClass();
        return new h(new m8.i(zVar, b), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public InterfaceC2099a sendMetrics(String str, String str2, G g9) {
        G7.j.e(str, "ua");
        G7.j.e(str2, MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        G7.j.e(g9, "requestBody");
        i8.t tVar = new i8.t();
        tVar.d(null, str2);
        i8.B defaultProtoBufBuilder = defaultProtoBufBuilder(str, tVar.a().f().a().f20891i);
        defaultProtoBufBuilder.e(g9);
        C b = defaultProtoBufBuilder.b();
        i8.z zVar = (i8.z) this.okHttpClient;
        zVar.getClass();
        return new h(new m8.i(zVar, b), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public void setAppId(String str) {
        G7.j.e(str, "appId");
        this.appId = str;
    }
}
