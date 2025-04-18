package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class d implements a {
    private com.mbridge.msdk.newreward.function.c.c a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.a.e f14347b;

    /* renamed from: c, reason: collision with root package name */
    private int f14348c = 0;

    /* renamed from: com.mbridge.msdk.newreward.a.b.d$2, reason: invalid class name */
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
        com.mbridge.msdk.newreward.function.d.a.b bVar2 = (com.mbridge.msdk.newreward.function.d.a.b) obj;
        final com.mbridge.msdk.newreward.function.d.c.d<?> u = bVar2.u();
        if (bVar2.F() != null) {
            if (bVar2.F().containsKey("command_manager")) {
                this.a = (com.mbridge.msdk.newreward.function.c.c) bVar2.F().get("command_manager");
            }
            if (bVar2.F().containsKey("adapter_model")) {
                this.f14347b = (com.mbridge.msdk.newreward.a.e) bVar2.F().get("adapter_model");
            }
        }
        if (u == null) {
            bVar.a(bVar2);
            return;
        }
        if (u.e() == 1) {
            this.f14348c = 1;
        } else {
            this.f14348c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, bVar2, 0, "");
        u.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.d.1
            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar) {
                if (bVar3.x()) {
                    bVar.a(bVar3);
                }
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 1, "");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 3, mBridgeError != null ? mBridgeError.getErrorMessage() : "");
                a(bVar3, bVar, mBridgeError, "errorCode: 3203 errorMessage:");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 2, mBridgeError != null ? mBridgeError.getErrorMessage() : "");
                a(bVar3, bVar, mBridgeError, "errorCode: 3401 errorMessage: ");
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, b bVar4, MBridgeError mBridgeError, String str) {
                int errorCode;
                String errorMessage;
                if (bVar3.x()) {
                    try {
                        bVar4.a(bVar3);
                        return;
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReqDownBigTempleService", "doReq: ", e2);
                            return;
                        }
                        return;
                    }
                }
                if (mBridgeError != null) {
                    try {
                        errorCode = mBridgeError.getErrorCode();
                        errorMessage = mBridgeError.getErrorMessage();
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReqDownBigTempleService", "doReq: ", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    errorMessage = "big temp load fail ";
                    errorCode = -1;
                }
                if (u.c()) {
                    return;
                }
                bVar4.a(com.mbridge.msdk.foundation.c.a.a(errorCode, 880005, str + errorMessage));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, int i10, String str) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.a;
        if (cVar == null || this.f14347b == null) {
            return;
        }
        try {
            Map a = cVar.a("resource_type", 1, "url", bVar.u().j());
            int i11 = AnonymousClass2.a[eVar.ordinal()];
            if (i11 != 1) {
                if (i11 == 2 && this.f14348c == 2) {
                    a.put("result", Integer.valueOf(i10));
                    if (i10 != 1) {
                        a.put("reason", str);
                    }
                    this.a.a(this.f14347b, eVar, a);
                    return;
                }
                return;
            }
            a.put("cache", Integer.valueOf(this.f14348c));
            this.a.a(this.f14347b, eVar, a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
