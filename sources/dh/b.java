package dh;

import a4.y;
import android.util.Base64;
import android.view.View;
import androidx.emoji2.text.t;
import bh.l3;
import com.vungle.ads.internal.util.v;
import java.net.URL;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes4.dex */
public final class b {
    private vd.a adEvents;
    private vd.b adSession;
    private final Json json;

    public b(String omSdkData) {
        l3 l3Var;
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(omSdkData, "omSdkData");
        Json Json$default = JsonKt.Json$default(null, a.INSTANCE, 1, null);
        this.json = Json$default;
        try {
            t b3 = t.b(vd.d.NATIVE_DISPLAY, vd.f.BEGIN_TO_RENDER, vd.g.NATIVE, vd.g.NONE);
            com.bumptech.glide.e.d("Vungle", "Name is null or empty");
            com.bumptech.glide.e.d("7.3.2", "Version is null or empty");
            y yVar = new y("Vungle", "7.3.2", 6);
            byte[] decode = Base64.decode(omSdkData, 0);
            if (decode != null) {
                String str3 = new String(decode, Charsets.UTF_8);
                KSerializer<Object> serializer = SerializersKt.serializer(Json$default.getSerializersModule(), Reflection.typeOf(l3.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                l3Var = (l3) Json$default.decodeFromString(serializer, str3);
            } else {
                l3Var = null;
            }
            if (l3Var != null) {
                str = l3Var.getVendorKey();
            } else {
                str = null;
            }
            if (l3Var != null) {
                str2 = l3Var.getVendorURL();
            } else {
                str2 = null;
            }
            URL url = new URL(str2);
            String params = l3Var != null ? l3Var.getParams() : null;
            com.bumptech.glide.e.d(str, "VendorKey is null or empty");
            com.bumptech.glide.e.d(params, "VerificationParameters is null or empty");
            vd.h verificationScriptResource = new vd.h(str, url, params);
            Intrinsics.checkNotNullExpressionValue(verificationScriptResource, "verificationScriptResource");
            List listOf = CollectionsKt.listOf(verificationScriptResource);
            String oM_JS$vungle_ads_release = h.INSTANCE.getOM_JS$vungle_ads_release();
            com.bumptech.glide.e.c(oM_JS$vungle_ads_release, "OM SDK JS script content is null");
            com.bumptech.glide.e.c(listOf, "VerificationScriptResources is null");
            this.adSession = vd.b.a(b3, new android.support.v4.media.d(yVar, null, oM_JS$vungle_ads_release, listOf, vd.c.NATIVE));
        } catch (Exception e2) {
            v.Companion.e("NativeOMTracker", "error occured when create omsdk adSession:", e2);
        }
    }

    public final void impressionOccurred() {
        boolean z10;
        boolean z11;
        vd.a aVar = this.adEvents;
        if (aVar != null) {
            vd.i iVar = aVar.a;
            if (!iVar.f26515g) {
                if (iVar.f26510b.g()) {
                    if (iVar.f26514f && !iVar.f26515g) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z10) {
                        try {
                            iVar.d();
                        } catch (Exception unused) {
                        }
                    }
                    if (iVar.f26514f && !iVar.f26515g) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        if (!iVar.f26517i) {
                            yd.a aVar2 = iVar.f26513e;
                            ka.e.f20531c.a(aVar2.e(), "publishImpressionEvent", aVar2.a);
                            iVar.f26517i = true;
                            return;
                        }
                        throw new IllegalStateException("Impression event can only be sent once");
                    }
                    return;
                }
                throw new IllegalStateException("Impression event is not expected from the Native AdSession");
            }
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public final void start(View view) {
        vd.b bVar;
        Intrinsics.checkNotNullParameter(view, "view");
        if (com.facebook.appevents.g.f10941f.b() && (bVar = this.adSession) != null) {
            bVar.c(view);
            bVar.d();
            vd.i iVar = (vd.i) bVar;
            yd.a aVar = iVar.f26513e;
            if (aVar.f28168c == null) {
                boolean z10 = iVar.f26515g;
                if (!z10) {
                    vd.a aVar2 = new vd.a(iVar);
                    aVar.f28168c = aVar2;
                    this.adEvents = aVar2;
                    if (iVar.f26514f) {
                        if (!z10) {
                            if (iVar.f26510b.g()) {
                                if (!iVar.f26518j) {
                                    yd.a aVar3 = iVar.f26513e;
                                    ka.e.f20531c.a(aVar3.e(), "publishLoadedEvent", null, aVar3.a);
                                    iVar.f26518j = true;
                                    return;
                                }
                                throw new IllegalStateException("Loaded event can only be sent once");
                            }
                            throw new IllegalStateException("Impression event is not expected from the Native AdSession");
                        }
                        throw new IllegalStateException("AdSession is finished");
                    }
                    throw new IllegalStateException("AdSession is not started");
                }
                throw new IllegalStateException("AdSession is finished");
            }
            throw new IllegalStateException("AdEvents already exists for AdSession");
        }
    }

    public final void stop() {
        vd.b bVar = this.adSession;
        if (bVar != null) {
            bVar.b();
        }
        this.adSession = null;
    }
}
