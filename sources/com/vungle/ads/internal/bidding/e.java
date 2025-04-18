package com.vungle.ads.internal.bidding;

import android.content.Context;
import bh.g1;
import bh.r3;
import bh.u3;
import com.vungle.ads.ServiceLocator$Companion;
import com.vungle.ads.e3;
import com.vungle.ads.internal.f0;
import com.vungle.ads.internal.network.y;
import com.vungle.ads.internal.util.h;
import com.vungle.ads.internal.util.s;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.v;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;

/* loaded from: classes4.dex */
public final class e {
    public static final b Companion = new b(null);
    private static final int TOKEN_VERSION = 5;
    private final Context context;
    private long enterBackgroundTime;
    private final Json json;
    private int ordinalView;

    public e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.json = JsonKt.Json$default(null, d.INSTANCE, 1, null);
        h.Companion.addLifecycleListener(new a(this));
    }

    private final String bidTokenV5() {
        try {
            String constructV5Token$vungle_ads_release = constructV5Token$vungle_ads_release();
            u uVar = v.Companion;
            uVar.w("BidTokenEncoder", "BidToken: " + constructV5Token$vungle_ads_release);
            String convertForSending = s.INSTANCE.convertForSending(constructV5Token$vungle_ads_release);
            uVar.w("BidTokenEncoder", "After conversion: 5:" + convertForSending);
            return "5:" + convertForSending;
        } catch (Exception e2) {
            com.vungle.ads.s.INSTANCE.logError$vungle_ads_release(116, "Fail to gzip bidtoken " + e2.getLocalizedMessage(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    /* renamed from: constructV5Token$lambda-0, reason: not valid java name */
    private static final y m14constructV5Token$lambda0(Lazy<y> lazy) {
        return lazy.getValue();
    }

    public final String constructV5Token$vungle_ads_release() {
        ServiceLocator$Companion serviceLocator$Companion = e3.Companion;
        g1 requestBody = m14constructV5Token$lambda0(LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new c(this.context))).requestBody(!f0.INSTANCE.signalsDisabled());
        u3 u3Var = new u3(requestBody.getDevice(), requestBody.getUser(), requestBody.getExt(), new r3(y.Companion.getHeaderUa()), this.ordinalView);
        Json json = this.json;
        KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(u3.class));
        Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return json.encodeToString(serializer, u3Var);
    }

    public final String encode() {
        this.ordinalView++;
        return bidTokenV5();
    }
}
