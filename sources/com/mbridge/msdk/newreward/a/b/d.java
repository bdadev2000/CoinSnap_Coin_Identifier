package com.mbridge.msdk.newreward.a.b;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import com.mbridge.msdk.newreward.function.d.c.q;
import com.mbridge.msdk.newreward.function.d.c.x;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.c f16931a;
    private com.mbridge.msdk.newreward.a.e b;

    /* renamed from: c, reason: collision with root package name */
    private int f16932c = 0;

    /* renamed from: com.mbridge.msdk.newreward.a.b.d$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16935a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f16935a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16935a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.mbridge.msdk.newreward.a.b.a
    public final void a(Object obj, final b bVar) throws IOException {
        com.mbridge.msdk.newreward.function.d.a.b bVar2 = (com.mbridge.msdk.newreward.function.d.a.b) obj;
        final com.mbridge.msdk.newreward.function.d.c.d<?> u8 = bVar2.u();
        if (bVar2.F() != null) {
            if (bVar2.F().containsKey("command_manager")) {
                this.f16931a = (com.mbridge.msdk.newreward.function.c.c) bVar2.F().get("command_manager");
            }
            if (bVar2.F().containsKey("adapter_model")) {
                this.b = (com.mbridge.msdk.newreward.a.e) bVar2.F().get("adapter_model");
            }
        }
        if (u8 == null) {
            bVar.a(bVar2);
            return;
        }
        if (u8.e() == 1) {
            this.f16932c = 1;
        } else {
            this.f16932c = 2;
        }
        a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START, bVar2, 0, "");
        u8.k().a(0, new x() { // from class: com.mbridge.msdk.newreward.a.b.d.1
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
                String str;
                if (mBridgeError != null) {
                    str = mBridgeError.getErrorMessage();
                } else {
                    str = "";
                }
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 3, str);
                a(bVar3, bVar, mBridgeError, "errorCode: 3203 errorMessage:");
            }

            @Override // com.mbridge.msdk.newreward.function.d.c.x
            public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar3, com.mbridge.msdk.newreward.function.d.a.a aVar, q qVar, MBridgeError mBridgeError) {
                String str;
                if (mBridgeError != null) {
                    str = mBridgeError.getErrorMessage();
                } else {
                    str = "";
                }
                d.this.a(com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END, bVar3, 2, str);
                a(bVar3, bVar, mBridgeError, "errorCode: 3401 errorMessage: ");
            }

            private void a(com.mbridge.msdk.newreward.function.d.a.b bVar3, b bVar4, MBridgeError mBridgeError, String str) {
                int errorCode;
                String errorMessage;
                if (bVar3.x()) {
                    try {
                        bVar4.a(bVar3);
                        return;
                    } catch (Exception e4) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReqDownBigTempleService", "doReq: ", e4);
                            return;
                        }
                        return;
                    }
                }
                if (mBridgeError == null) {
                    errorMessage = "big temp load fail ";
                    errorCode = -1;
                } else {
                    try {
                        errorCode = mBridgeError.getErrorCode();
                        errorMessage = mBridgeError.getErrorMessage();
                    } catch (Exception e9) {
                        if (MBridgeConstans.DEBUG) {
                            ad.b("ReqDownBigTempleService", "doReq: ", e9);
                            return;
                        }
                        return;
                    }
                }
                if (u8.c()) {
                    return;
                }
                bVar4.a(com.mbridge.msdk.foundation.c.a.a(errorCode, 880005, str + errorMessage));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.newreward.function.c.e eVar, com.mbridge.msdk.newreward.function.d.a.b bVar, int i9, String str) {
        com.mbridge.msdk.newreward.function.c.c cVar = this.f16931a;
        if (cVar == null || this.b == null) {
            return;
        }
        try {
            Map a6 = cVar.a("resource_type", 1, "url", bVar.u().j());
            int i10 = AnonymousClass2.f16935a[eVar.ordinal()];
            if (i10 != 1) {
                if (i10 == 2 && this.f16932c == 2) {
                    a6.put("result", Integer.valueOf(i9));
                    if (i9 != 1) {
                        a6.put("reason", str);
                    }
                    this.f16931a.a(this.b, eVar, a6);
                    return;
                }
                return;
            }
            a6.put("cache", Integer.valueOf(this.f16932c));
            this.f16931a.a(this.b, eVar, a6);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
