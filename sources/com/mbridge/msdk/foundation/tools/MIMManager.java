package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class MIMManager {

    /* renamed from: a */
    private static volatile String f15954a;
    private final AtomicBoolean b;

    /* renamed from: c */
    private int f15955c;

    /* renamed from: d */
    private CopyOnWriteArrayList<CampaignEx> f15956d;

    /* renamed from: e */
    private Context f15957e;

    /* renamed from: f */
    private volatile Boolean f15958f;

    /* renamed from: g */
    private CampaignEx f15959g;

    /* renamed from: h */
    private volatile b f15960h;

    /* renamed from: i */
    private volatile MiOverseaMiniCardBroadcasterReceiver f15961i;

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f15962a;

        public AnonymousClass1(Context context) {
            r2 = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (MIMManager.this.b.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f15958f = mIMManager.g();
                } catch (Exception e4) {
                    ad.a("MIMManager", e4.getMessage());
                }
                if (MIMManager.this.f15958f != null && MIMManager.this.f15958f.booleanValue() && r2 != null) {
                    try {
                        MIMManager.this.f15960h = new b();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                        r2.registerReceiver(MIMManager.this.f15960h, intentFilter);
                    } catch (Exception e9) {
                        ad.a("MIMManager", e9.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f15963a;
        final /* synthetic */ CampaignEx b;

        public AnonymousClass2(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] u8;
            try {
                Context context = r2;
                CampaignEx campaignEx = r3;
                if (campaignEx != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null && (u8 = nativeVideoTracking.u()) != null) {
                            for (String str : u8) {
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                            }
                        }
                    } catch (Exception e4) {
                        ad.b("MIMManager", e4.getMessage());
                    }
                }
            } catch (Exception e9) {
                ad.b("MIMManager", e9.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f15965a;
        final /* synthetic */ CampaignEx b;

        public AnonymousClass3(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] v6;
            try {
                Context context = r2;
                CampaignEx campaignEx = r3;
                if (campaignEx != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null && (v6 = nativeVideoTracking.v()) != null) {
                            for (String str : v6) {
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                            }
                        }
                    } catch (Exception e4) {
                        ad.b("MIMManager", e4.getMessage());
                    }
                }
            } catch (Exception e9) {
                ad.b("MIMManager", e9.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$4 */
    /* loaded from: classes3.dex */
    public class AnonymousClass4 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f15967a;
        final /* synthetic */ CampaignEx b;

        public AnonymousClass4(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] w2;
            try {
                try {
                    Context context = r2;
                    CampaignEx campaignEx = r3;
                    if (campaignEx != null) {
                        try {
                            com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                            if (nativeVideoTracking != null && (w2 = nativeVideoTracking.w()) != null) {
                                for (String str : w2) {
                                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                                }
                            }
                        } catch (Exception e4) {
                            ad.b("MIMManager", e4.getMessage());
                        }
                    }
                    if (MIMManager.this.f15956d == null || !MIMManager.this.f15956d.contains(r3)) {
                        return;
                    }
                } catch (Exception e9) {
                    ad.b("MIMManager", e9.getMessage());
                    if (MIMManager.this.f15956d == null || !MIMManager.this.f15956d.contains(r3)) {
                        return;
                    }
                }
                MIMManager.this.f15956d.remove(r3);
            } catch (Throwable th) {
                if (MIMManager.this.f15956d != null && MIMManager.this.f15956d.contains(r3)) {
                    MIMManager.this.f15956d.remove(r3);
                }
                throw th;
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f15969a;
        final /* synthetic */ String b;

        /* renamed from: c */
        final /* synthetic */ CampaignEx f15970c;

        /* renamed from: d */
        final /* synthetic */ int f15971d;

        public AnonymousClass5(Context context, String str, CampaignEx campaignEx, int i9) {
            r2 = context;
            r3 = str;
            r4 = campaignEx;
            r5 = i9;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (r2 != null && !TextUtils.isEmpty(r3) && r4 != null) {
                    StringBuffer stringBuffer = new StringBuffer("key=2000100&network_type=");
                    stringBuffer.append(z.l(r2));
                    stringBuffer.append("&");
                    if (!TextUtils.isEmpty(r4.getRequestIdNotice())) {
                        stringBuffer.append("rid_n=");
                        stringBuffer.append(r4.getRequestIdNotice());
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(r4.getRequestId())) {
                        stringBuffer.append("rid=");
                        stringBuffer.append(r4.getRequestId());
                        stringBuffer.append("&");
                    }
                    if (!TextUtils.isEmpty(r4.getCampaignUnitId())) {
                        stringBuffer.append("unit_id=");
                        stringBuffer.append(r4.getCampaignUnitId());
                        stringBuffer.append("&");
                        String str = com.mbridge.msdk.foundation.controller.a.b.get(r4.getCampaignUnitId());
                        StringBuilder sb = new StringBuilder("u_stid=");
                        if (str == null) {
                            str = "";
                        }
                        sb.append(str);
                        sb.append("&");
                        stringBuffer.append(sb.toString());
                    }
                    if (!TextUtils.isEmpty(r4.getId())) {
                        stringBuffer.append("cid=");
                        stringBuffer.append(r4.getId());
                        stringBuffer.append("&");
                    }
                    stringBuffer.append("status=");
                    stringBuffer.append(r3);
                    stringBuffer.append("&code=");
                    stringBuffer.append(r5);
                    com.mbridge.msdk.foundation.same.report.d.c.a().d(stringBuffer.toString());
                }
            } catch (Throwable th) {
                ad.b("MIMManager", th.getMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i9;
            if (x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra("errorCode", 0);
                if (intExtra < 0) {
                    i9 = intent.getIntExtra("reason", 0);
                } else {
                    i9 = -1;
                }
                ad.b("MIMManager", stringExtra + " " + intExtra + " " + i9);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("key", URLEncoder.encode("m_mini_card", "utf-8"));
                        CampaignEx a6 = a.f15973a.a(stringExtra);
                        if (a6 != null) {
                            dVar.a("rid", a6.getRequestId());
                            dVar.a("rid_n", a6.getRequestIdNotice());
                            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, a6.getCampaignUnitId());
                            dVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.b.get(a6.getCampaignUnitId()));
                            bVar.a(a6);
                        }
                        dVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        dVar.a("pkg_name", stringExtra);
                        if (i9 != -1) {
                            dVar.a("reasonCode", String.valueOf(i9));
                        }
                        bVar.a("m_mini_card", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mini_card", bVar);
                    } catch (Exception e4) {
                        ad.b("MIMManager", e4.getMessage());
                    }
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private static final MIMManager f15973a = new MIMManager();
    }

    /* loaded from: classes3.dex */
    public static class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[Catch: Exception -> 0x0076, TryCatch #0 {Exception -> 0x0076, blocks: (B:12:0x0033, B:15:0x003a, B:17:0x004b, B:21:0x0052, B:24:0x005d, B:32:0x0086, B:33:0x008d, B:36:0x006f, B:38:0x0078, B:39:0x007e), top: B:11:0x0033 }] */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onReceive(android.content.Context r9, android.content.Intent r10) {
            /*
                r8 = this;
                java.lang.String r0 = r10.getAction()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto Lb
                return
            Lb:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L19
                goto Lb4
            L19:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L27
                goto Lb4
            L27:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lb4
                android.os.Bundle r10 = r10.getExtras()     // Catch: java.lang.Exception -> L76
                if (r10 != 0) goto L3a
                return
            L3a:
                java.lang.String r0 = "statusCode"
                r1 = -1
                int r7 = r10.getInt(r0, r1)     // Catch: java.lang.Exception -> L76
                java.lang.String r0 = "packageName"
                java.lang.String r2 = ""
                java.lang.String r10 = r10.getString(r0, r2)     // Catch: java.lang.Exception -> L76
                if (r7 == r1) goto Laa
                boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> L76
                if (r0 == 0) goto L52
                goto Laa
            L52:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                com.mbridge.msdk.foundation.entity.CampaignEx r10 = com.mbridge.msdk.foundation.tools.MIMManager.a(r0, r10)     // Catch: java.lang.Exception -> L76
                if (r10 != 0) goto L5d
                return
            L5d:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                r1 = 3001(0xbb9, float:4.205E-42)
                if (r7 == r1) goto L7e
                r1 = 3002(0xbba, float:4.207E-42)
                if (r7 == r1) goto L78
                r1 = 3008(0xbc0, float:4.215E-42)
                if (r7 == r1) goto L6f
                r10 = 0
                goto L84
            L6f:
                com.mbridge.msdk.foundation.tools.MIMManager$4 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$4     // Catch: java.lang.Exception -> L76
                r1.<init>()     // Catch: java.lang.Exception -> L76
            L74:
                r10 = r1
                goto L84
            L76:
                r9 = move-exception
                goto Lab
            L78:
                com.mbridge.msdk.foundation.tools.MIMManager$3 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$3     // Catch: java.lang.Exception -> L76
                r1.<init>()     // Catch: java.lang.Exception -> L76
                goto L74
            L7e:
                com.mbridge.msdk.foundation.tools.MIMManager$2 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$2     // Catch: java.lang.Exception -> L76
                r1.<init>()     // Catch: java.lang.Exception -> L76
                goto L74
            L84:
                if (r10 == 0) goto L8d
                java.util.concurrent.ThreadPoolExecutor r0 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> L76
                r0.execute(r10)     // Catch: java.lang.Exception -> L76
            L8d:
                com.mbridge.msdk.foundation.tools.MIMManager r3 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                java.lang.String r5 = "dm_page_status"
                com.mbridge.msdk.foundation.tools.MIMManager r10 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> L76
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r10.b()     // Catch: java.lang.Exception -> L76
                java.util.concurrent.ThreadPoolExecutor r10 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> L76
                com.mbridge.msdk.foundation.tools.MIMManager$5 r0 = new com.mbridge.msdk.foundation.tools.MIMManager$5     // Catch: java.lang.Exception -> L76
                r2 = r0
                r4 = r9
                r2.<init>()     // Catch: java.lang.Exception -> L76
                r10.execute(r0)     // Catch: java.lang.Exception -> L76
                goto Lb4
            Laa:
                return
            Lab:
                java.lang.String r10 = "MIMManager"
                java.lang.String r9 = r9.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
            Lb4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.MIMManager.b.onReceive(android.content.Context, android.content.Intent):void");
        }

        public /* synthetic */ b(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    public /* synthetic */ MIMManager(AnonymousClass1 anonymousClass1) {
        this();
    }

    public Boolean g() {
        Cursor cursor;
        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
        Boolean bool = null;
        if (c9 != null) {
            try {
                if (c9.getContentResolver() != null) {
                    try {
                        cursor = c9.getContentResolver().query(Uri.parse(x.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursor = null;
                    }
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            try {
                                String string = cursor.getString(cursor.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string)) {
                                    if (!string.equalsIgnoreCase("null")) {
                                        if (!string.equalsIgnoreCase("false")) {
                                            if (string.equalsIgnoreCase("true")) {
                                            }
                                        }
                                        bool = Boolean.valueOf(Boolean.parseBoolean(string));
                                    }
                                }
                            } catch (Exception e4) {
                                ad.a("MIMManager", e4.getMessage());
                            }
                            try {
                                f15954a = cursor.getString(cursor.getColumnIndex("detailStyle"));
                            } catch (Exception e9) {
                                ad.a("MIMManager", e9.getMessage());
                            }
                        }
                        try {
                            cursor.close();
                        } catch (Exception e10) {
                            ad.a("MIMManager", e10.getMessage());
                        }
                    }
                }
            } catch (Exception e11) {
                ad.b("MIMManager", e11.getMessage());
            }
        }
        return bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
    
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r4.f15956d = null;
        r4.f15960h = null;
        r4.f15957e = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        if (r0 == null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r4 = this;
            int r0 = r4.f15955c
            int r0 = r0 + (-1)
            r4.f15955c = r0
            if (r0 > 0) goto L89
            android.content.Context r0 = r4.f15957e
            java.lang.String r1 = "MIMManager"
            r2 = 0
            if (r0 == 0) goto L54
            com.mbridge.msdk.foundation.tools.MIMManager$b r3 = r4.f15960h     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r3 == 0) goto L1d
            com.mbridge.msdk.foundation.tools.MIMManager$b r3 = r4.f15960h     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r0.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            goto L1d
        L19:
            r0 = move-exception
            goto L44
        L1b:
            r0 = move-exception
            goto L36
        L1d:
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r3 = r4.f15961i     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            if (r3 == 0) goto L26
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r3 = r4.f15961i     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
            r0.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1b
        L26:
            r4.f15959g = r2
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f15956d
            if (r0 == 0) goto L2f
        L2c:
            r0.clear()
        L2f:
            r4.f15956d = r2
            r4.f15960h = r2
            r4.f15957e = r2
            goto L54
        L36:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L19
            com.mbridge.msdk.foundation.tools.ad.a(r1, r0)     // Catch: java.lang.Throwable -> L19
            r4.f15959g = r2
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f15956d
            if (r0 == 0) goto L2f
            goto L2c
        L44:
            r4.f15959g = r2
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r4.f15956d
            if (r1 == 0) goto L4d
            r1.clear()
        L4d:
            r4.f15956d = r2
            r4.f15960h = r2
            r4.f15957e = r2
            throw r0
        L54:
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r0 = r4.f15961i     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            if (r0 == 0) goto L89
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            android.content.Context r0 = r0.c()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            if (r0 == 0) goto L6c
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r3 = r4.f15961i     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r0.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            goto L6c
        L68:
            r0 = move-exception
            goto L82
        L6a:
            r0 = move-exception
            goto L7a
        L6c:
            r4.f15959g = r2     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f15956d     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            if (r0 == 0) goto L75
            r0.clear()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
        L75:
            r4.f15956d = r2     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            r4.f15961i = r2     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L6a
            goto L89
        L7a:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L68
            com.mbridge.msdk.foundation.tools.ad.a(r1, r0)     // Catch: java.lang.Throwable -> L68
            goto L89
        L82:
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.MIMManager.f():void");
    }

    private MIMManager() {
        this.f15955c = 0;
        this.f15956d = new CopyOnWriteArrayList<>();
        this.b = new AtomicBoolean(false);
    }

    public final CampaignEx b() {
        return this.f15959g;
    }

    public final String c() {
        try {
            if (f15954a == null) {
                return "";
            }
            return "[" + f15954a + "]";
        } catch (Exception unused) {
            return "";
        }
    }

    public final Boolean d() {
        return this.f15958f;
    }

    public final void e() {
        this.f15955c++;
    }

    public final void b(CampaignEx campaignEx) {
        try {
            if (this.f15958f == null || campaignEx == null || !this.f15958f.booleanValue()) {
                return;
            }
            this.f15959g = null;
            try {
                this.f15956d.remove(campaignEx);
            } catch (Exception e4) {
                ad.a("MIMManager", e4.getMessage());
            }
        } catch (Exception e9) {
            ad.b("MIMManager", e9.getMessage());
        }
    }

    public static MIMManager a() {
        return a.f15973a;
    }

    public final void a(CampaignEx campaignEx) {
        try {
            if (this.f15958f != null && campaignEx != null && this.f15958f.booleanValue()) {
                this.f15959g = campaignEx;
                this.f15956d.add(campaignEx);
            }
            if (com.mbridge.msdk.e.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f15961i == null) {
                    try {
                        if (this.f15961i == null) {
                            this.f15961i = new MiOverseaMiniCardBroadcasterReceiver();
                        }
                        IntentFilter intentFilter = new IntentFilter(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
                        Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (c9 != null) {
                            c9.registerReceiver(this.f15961i, intentFilter);
                        }
                    } catch (Exception e4) {
                        ad.a("MIMManager", e4.getMessage());
                    }
                }
                this.f15959g = campaignEx;
                this.f15956d.add(campaignEx);
            }
        } catch (Exception e9) {
            ad.b("MIMManager", e9.getMessage());
        }
    }

    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f15959g;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f15959g;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f15956d;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            Iterator<CampaignEx> it = this.f15956d.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e4) {
            ad.b("MIMManager", e4.getMessage());
            return null;
        }
    }

    public final void a(Context context) {
        this.f15957e = context;
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.MIMManager.1

            /* renamed from: a */
            final /* synthetic */ Context f15962a;

            public AnonymousClass1(Context context2) {
                r2 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (MIMManager.this.b.compareAndSet(false, true)) {
                    try {
                        MIMManager mIMManager = MIMManager.this;
                        mIMManager.f15958f = mIMManager.g();
                    } catch (Exception e4) {
                        ad.a("MIMManager", e4.getMessage());
                    }
                    if (MIMManager.this.f15958f != null && MIMManager.this.f15958f.booleanValue() && r2 != null) {
                        try {
                            MIMManager.this.f15960h = new b();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                            r2.registerReceiver(MIMManager.this.f15960h, intentFilter);
                        } catch (Exception e9) {
                            ad.a("MIMManager", e9.getMessage());
                        }
                    }
                }
            }
        });
    }
}
