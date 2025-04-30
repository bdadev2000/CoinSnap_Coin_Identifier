package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes3.dex */
public final class e implements com.mbridge.msdk.newreward.function.c.b.a {

    /* renamed from: a, reason: collision with root package name */
    com.mbridge.msdk.newreward.a.e f17077a;
    com.mbridge.msdk.newreward.function.c.c b;

    @Override // com.mbridge.msdk.newreward.function.c.b.a
    public final void a(com.mbridge.msdk.newreward.function.c.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        com.mbridge.msdk.newreward.function.f.e r9;
        com.mbridge.msdk.videocommon.d.c b;
        Queue<Integer> B5;
        Integer poll;
        int intValue;
        try {
            Map map = (Map) bVar.b();
            this.f17077a = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
            this.b = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
            try {
                Map<String, Long> map2 = com.mbridge.msdk.foundation.same.a.b.f15710k;
                if (map2 != null && map2.size() > 0) {
                    com.mbridge.msdk.foundation.same.a.b.f15710k.clear();
                }
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().c())).a(this.f17077a.A());
            } catch (Exception e9) {
                if (MBridgeConstans.DEBUG) {
                    e9.printStackTrace();
                }
            }
            try {
                com.mbridge.msdk.newreward.a.e eVar = this.f17077a;
                if (eVar.u() == 2 && TextUtils.isEmpty(eVar.C())) {
                    com.mbridge.msdk.foundation.c.b b8 = com.mbridge.msdk.foundation.c.a.b(880035, "errorCode: 3507 errorMessage: data load failed, errorMsg is bidToken null");
                    throw new MBridgeError(b8.a(), b8.b());
                }
                if (com.mbridge.msdk.system.a.map != null) {
                    if (((MBridgeDailyPlayModel) this.b.a(new HashMap(), com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).isOverDailyCap()) {
                        bVar2.a(new com.mbridge.msdk.foundation.c.b(880019));
                        return;
                    }
                    com.mbridge.msdk.newreward.a.e eVar2 = this.f17077a;
                    if (eVar2 != null && (r9 = eVar2.r()) != null && (b = r9.b()) != null && (B5 = b.B()) != null && B5.size() != 0 && (poll = B5.poll()) != null) {
                        intValue = poll.intValue() * 1000;
                        eVar2.e(intValue);
                        bVar2.a((Object) null);
                        return;
                    }
                    intValue = 25000;
                    eVar2.e(intValue);
                    bVar2.a((Object) null);
                    return;
                }
                com.mbridge.msdk.foundation.c.b b9 = com.mbridge.msdk.foundation.c.a.b(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is not init sdk");
                throw new MBridgeError(b9.a(), b9.b());
            } catch (MBridgeError e10) {
                bVar2.a(new com.mbridge.msdk.foundation.c.b(e10.getErrorCode(), e10.getErrorMessage()));
            }
        } catch (Exception e11) {
            bVar2.a(new com.mbridge.msdk.foundation.c.b(880020, e11.getMessage()));
        }
    }
}
