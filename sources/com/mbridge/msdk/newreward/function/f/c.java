package com.mbridge.msdk.newreward.function.f;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: com.mbridge.msdk.newreward.function.f.c$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17326a;

        static {
            int[] iArr = new int[com.mbridge.msdk.newreward.function.c.e.values().length];
            f17326a = iArr;
            try {
                iArr[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_RES_FAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_V3_RETRY_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_START.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_DOWNLOAD_END.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DATE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.METRICS_KEY_M_CANDIDATE_DB.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_CHECK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f17326a[com.mbridge.msdk.newreward.function.c.e.REPORT_SHOW_FAIL.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public final void a(com.mbridge.msdk.newreward.a.e eVar, Map map, com.mbridge.msdk.newreward.function.c.e eVar2) {
        List<CampaignEx> C8;
        if (eVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b b = com.mbridge.msdk.foundation.same.report.d.c.a().b(eVar.z());
            if (b == null) {
                b = new com.mbridge.msdk.foundation.same.report.d.b();
                b.c(eVar.z());
                b.b(eVar.p());
            }
            b.d(eVar.A());
            b.e(eVar.C());
            b.i(eVar.K() ? "1" : "0");
            if (eVar.x() != null) {
                b.b(eVar.x().a());
            }
            if (eVar.r() != null) {
                com.mbridge.msdk.videocommon.d.a a6 = eVar.r().a();
                if (a6 != null) {
                    b.h(a6.b());
                    b.f(a6.c());
                }
                com.mbridge.msdk.videocommon.d.c b8 = eVar.r().b();
                if (b8 != null) {
                    b.g(b8.l());
                    b.n(b8.k());
                }
            }
            Object obj = (map == null || !map.containsKey("metrics_data")) ? null : map.get("metrics_data");
            int i9 = 0;
            switch (AnonymousClass1.f17326a[eVar2.ordinal()]) {
                case 1:
                    b.a("2000125");
                    com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar.a(map);
                    b.a("2000125", dVar);
                    break;
                case 2:
                    b.a("2000126");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        b.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar2 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar2.a(map);
                    b.a("2000126", dVar2);
                    break;
                case 3:
                    b.a("2000126");
                    com.mbridge.msdk.foundation.same.report.d.d dVar3 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar3.a(map);
                    b.a("2000126", dVar3);
                    break;
                case 4:
                    b.a("m_v3_req_retry_start");
                    com.mbridge.msdk.foundation.same.report.d.d dVar4 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar4.a(map);
                    b.a("m_v3_req_retry_start", dVar4);
                    break;
                case 5:
                    b.a("m_v3_req_retry_end");
                    com.mbridge.msdk.foundation.same.report.d.d dVar5 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar5.a(map);
                    b.a("m_v3_req_retry_end", dVar5);
                    break;
                case 6:
                    b.a("2000127");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        b.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar6 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar6.a(map);
                    b.a("2000127", dVar6);
                    break;
                case 7:
                    b.a("2000048");
                    if (obj != null && (obj instanceof com.mbridge.msdk.newreward.function.d.a.b)) {
                        b.b(((com.mbridge.msdk.newreward.function.d.a.b) obj).C());
                    }
                    if (map != null) {
                        map.remove("metrics_data");
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar7 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar7.a(map);
                    b.a("2000048", dVar7);
                    break;
                case 8:
                    b.a("2000047");
                    if (obj != null && (obj instanceof com.mbridge.msdk.foundation.c.b)) {
                        b.a((com.mbridge.msdk.foundation.c.b) obj);
                        break;
                    }
                    break;
                case 9:
                    com.mbridge.msdk.foundation.same.report.d.d dVar8 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar8.a("m_load_check", Integer.valueOf(eVar.l() ? 1 : 0));
                    b.a("2000128", dVar8);
                    b.a("2000128");
                    break;
                case 10:
                    b.a("m_download_start");
                    com.mbridge.msdk.foundation.same.report.d.d dVar9 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar9.a(map);
                    if (map != null && (map.get("resource_type") instanceof Integer)) {
                        i9 = ((Integer) map.get("resource_type")).intValue();
                    }
                    int i10 = i9;
                    b.a("m_download_start", dVar9, i10);
                    b.a(i10);
                    break;
                case 11:
                    b.a("m_download_end");
                    com.mbridge.msdk.foundation.same.report.d.d dVar10 = new com.mbridge.msdk.foundation.same.report.d.d();
                    dVar10.a(map);
                    if (map != null && (map.get("resource_type") instanceof Integer)) {
                        i9 = ((Integer) map.get("resource_type")).intValue();
                    }
                    int i11 = i9;
                    b.a("m_download_end", dVar10, i11);
                    b.a(i11);
                    break;
                case 12:
                    b.a("m_candidate_data");
                    b.a("m_candidate_data", (com.mbridge.msdk.foundation.same.report.d.d) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.d.d()));
                    break;
                case 13:
                    b.a("m_candidate_db");
                    b.a("m_candidate_db", (com.mbridge.msdk.foundation.same.report.d.d) (map != null ? map.get("metrics_data") : new com.mbridge.msdk.foundation.same.report.d.d()));
                    break;
                case 14:
                    b.a("m_load_check");
                    com.mbridge.msdk.newreward.function.d.a.b bVar = (map == null || !map.containsKey("campaign")) ? null : (com.mbridge.msdk.newreward.function.d.a.b) map.remove("campaign");
                    if (bVar != null && (C8 = bVar.C()) != null) {
                        b.b(C8);
                    }
                    com.mbridge.msdk.foundation.same.report.d.d dVar11 = new com.mbridge.msdk.foundation.same.report.d.d();
                    if (map != null) {
                        dVar11.a(map);
                    }
                    b.a("m_load_check", dVar11);
                    break;
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(b);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(b.c(), b, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }

    public final void a(com.mbridge.msdk.newreward.b.b bVar, Map map, com.mbridge.msdk.newreward.function.c.e eVar) {
        if (bVar == null) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar2.c(bVar.b());
            bVar2.b(bVar.e());
            bVar2.d(bVar.c());
            bVar2.i(bVar.f() ? "1" : "0");
            if (bVar.g() != null) {
                com.mbridge.msdk.videocommon.d.a a6 = bVar.g().a();
                if (a6 != null) {
                    bVar2.h(a6.b());
                    bVar2.f(a6.c());
                }
                com.mbridge.msdk.videocommon.d.c b = bVar.g().b();
                if (b != null) {
                    bVar2.g(b.l());
                    bVar2.n(b.k());
                }
            }
            int i9 = AnonymousClass1.f17326a[eVar.ordinal()];
            if (i9 == 9) {
                bVar2.a("2000128");
            } else if (i9 == 15) {
                bVar2.a("2000131");
                com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                dVar.a(map);
                bVar2.a("2000131", dVar);
            }
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar2);
            com.mbridge.msdk.foundation.same.report.d.c.a().a(bVar2.c(), bVar2, (com.mbridge.msdk.foundation.same.report.d.a.a) null);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                e4.printStackTrace();
            }
        }
    }
}
