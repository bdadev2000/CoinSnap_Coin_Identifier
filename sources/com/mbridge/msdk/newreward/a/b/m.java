package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.n;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class m implements a {
    private com.mbridge.msdk.newreward.function.c.c a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f14373b;

    /* renamed from: c, reason: collision with root package name */
    private int f14374c = 0;

    /* renamed from: com.mbridge.msdk.newreward.a.b.m$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.a aVar = (com.mbridge.msdk.newreward.function.d.a.a) obj;
        final n d10 = aVar.d();
        if (aVar.h().F() != null) {
            if (aVar.h().F().containsKey("command_manager")) {
                this.a = (com.mbridge.msdk.newreward.function.c.c) aVar.h().F().get("command_manager");
            }
            if (aVar.h().F().containsKey("adapter_model")) {
                this.f14373b = (com.mbridge.msdk.newreward.a.e) aVar.h().F().get("adapter_model");
            }
        }
        if (d10 == null) {
            bVar.a(aVar);
            return;
        }
        if (d10.e() == 1) {
            this.f14374c = 1;
        } else {
            this.f14374c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, 0, aVar, null);
        d10.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.m.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar) {
                m.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 1, aVar2, null);
                try {
                    if (bVar2.x()) {
                        bVar.a(aVar2);
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("ReqVideoService", "doReq: ", e2);
                    }
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                m.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 3, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError);
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar2, b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar2, MBridgeError mBridgeError) {
                if (bVar2.x()) {
                    try {
                        bVar3.a(aVar2);
                        return;
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReqVideoService", "doReq: ", e2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if (d10.c()) {
                        return;
                    }
                    bVar3.a(com.mbridge.msdk.foundation.c.a.a(mBridgeError.getErrorCode(), 880004, mBridgeError.getErrorMessage()));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("ReqVideoService", "doReq: ", e10);
                    }
                }
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar2, com.mbridge.msdk.newreward.function.d.a.a aVar2, q qVar, MBridgeError mBridgeError) {
                m.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, 2, aVar2, mBridgeError);
                a(bVar2, bVar, aVar2, mBridgeError);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, int i10, com.mbridge.msdk.newreward.function.d.a.a aVar, MBridgeError mBridgeError) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.a;
        if (cVar == null || this.f14373b == null) {
            return;
        }
        try {
            Object[] objArr = new Object[12];
            objArr[0] = "resource_type";
            objArr[1] = 4;
            objArr[2] = "scenes";
            objArr[3] = 1;
            objArr[4] = "url";
            objArr[5] = aVar.d().j();
            objArr[6] = "resumed_breakpoint";
            objArr[7] = MBridgeConstans.API_REUQEST_CATEGORY_APP;
            objArr[8] = CampaignEx.JSON_KEY_READY_RATE;
            objArr[9] = 100;
            objArr[10] = "mraid_type";
            objArr[11] = Integer.valueOf(aVar.i() ? 1 : 0);
            Map a = cVar.a(objArr);
            int i11 = AnonymousClass2.a[eVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 && this.f14374c == 2) {
                    a.put("result", Integer.valueOf(i10));
                    if (i10 != 1 && mBridgeError != null) {
                        a.put("reason", mBridgeError.getErrorMessage());
                    }
                    this.a.a(this.f14373b, eVar, a);
                    return;
                }
                return;
            }
            a.put("cache", Integer.valueOf(this.f14374c));
            this.a.a(this.f14373b, eVar, a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
