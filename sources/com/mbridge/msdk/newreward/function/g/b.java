package com.mbridge.msdk.newreward.function.g;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.newreward.function.c.e;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.newreward.function.common.MBridgeOffsetManager;
import java.util.Map;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f17338a;

    /* renamed from: com.mbridge.msdk.newreward.function.g.b$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17339a;

        static {
            int[] iArr = new int[e.values().length];
            f17339a = iArr;
            try {
                iArr[e.REQ_SETTING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17339a[e.REQ_CAMPAIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private b() {
    }

    public static b a() {
        if (f17338a == null) {
            synchronized (b.class) {
                try {
                    if (f17338a == null) {
                        f17338a = new b();
                    }
                } finally {
                }
            }
        }
        return f17338a;
    }

    public final <T extends a> a a(Object obj, e eVar) {
        int i9 = AnonymousClass1.f17339a[eVar.ordinal()];
        if (i9 == 1) {
            c cVar = new c();
            com.mbridge.msdk.newreward.function.c.b bVar = (com.mbridge.msdk.newreward.function.c.b) obj;
            if (!(bVar.b() instanceof Map)) {
                return cVar;
            }
            Map map = (Map) bVar.b();
            cVar.a(((Integer) map.get("mb_ad_type")).intValue());
            cVar.a((String) map.get("mb_ad_unit_id"));
            return cVar;
        }
        if (i9 != 2) {
            return null;
        }
        Map map2 = (Map) obj;
        com.mbridge.msdk.newreward.a.e eVar2 = (com.mbridge.msdk.newreward.a.e) map2.get("adapter_model");
        MBridgeOffsetManager mBridgeOffsetManager = (MBridgeOffsetManager) ((com.mbridge.msdk.newreward.function.c.c) map2.get("command_manager")).a((Object) null, e.CREATE_OFFSET);
        if (mBridgeOffsetManager == null) {
            eVar2.a(0);
        } else {
            eVar2.a(mBridgeOffsetManager.getOffset());
        }
        d dVar = new d(eVar2.p(), eVar2.w(), eVar2.A(), !TextUtils.isEmpty(eVar2.C()), eVar2.C());
        dVar.a(eVar2.E());
        dVar.e(eVar2.z());
        dVar.c(eVar2.F());
        dVar.b(eVar2.G());
        dVar.a(eVar2.e());
        if (com.mbridge.msdk.e.b.a()) {
            eVar2.A();
            com.mbridge.msdk.foundation.controller.c.m().c();
            TextUtils.isEmpty("");
            dVar.c("");
        }
        String a6 = ai.a(com.mbridge.msdk.foundation.controller.c.m().c(), eVar2.A());
        if (TextUtils.isEmpty(a6)) {
            a6 = "";
        }
        dVar.a(a6);
        dVar.b("");
        dVar.d(TextUtils.isEmpty(MBridgeGlobalCommon.SESSION_ID) ? "" : MBridgeGlobalCommon.SESSION_ID);
        return dVar;
    }
}
