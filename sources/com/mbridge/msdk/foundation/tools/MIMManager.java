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
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public final class MIMManager {
    private static volatile String a;

    /* renamed from: b */
    private final AtomicBoolean f13514b;

    /* renamed from: c */
    private int f13515c;

    /* renamed from: d */
    private CopyOnWriteArrayList<CampaignEx> f13516d;

    /* renamed from: e */
    private Context f13517e;

    /* renamed from: f */
    private volatile Boolean f13518f;

    /* renamed from: g */
    private CampaignEx f13519g;

    /* renamed from: h */
    private volatile b f13520h;

    /* renamed from: i */
    private volatile MiOverseaMiniCardBroadcasterReceiver f13521i;

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$1 */
    /* loaded from: classes4.dex */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ Context a;

        public AnonymousClass1(Context context) {
            r2 = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (MIMManager.this.f13514b.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f13518f = mIMManager.g();
                } catch (Exception e2) {
                    ad.a("MIMManager", e2.getMessage());
                }
                if (MIMManager.this.f13518f != null && MIMManager.this.f13518f.booleanValue() && r2 != null) {
                    try {
                        MIMManager.this.f13520h = new b();
                        IntentFilter intentFilter = new IntentFilter();
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                        intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                        r2.registerReceiver(MIMManager.this.f13520h, intentFilter);
                    } catch (Exception e10) {
                        ad.a("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$2 */
    /* loaded from: classes4.dex */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Context a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f13523b;

        public AnonymousClass2(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] u;
            try {
                Context context = r2;
                CampaignEx campaignEx = r3;
                if (campaignEx != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null && (u = nativeVideoTracking.u()) != null) {
                            for (String str : u) {
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                            }
                        }
                    } catch (Exception e2) {
                        ad.b("MIMManager", e2.getMessage());
                    }
                }
            } catch (Exception e10) {
                ad.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$3 */
    /* loaded from: classes4.dex */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ Context a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f13525b;

        public AnonymousClass3(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] v10;
            try {
                Context context = r2;
                CampaignEx campaignEx = r3;
                if (campaignEx != null) {
                    try {
                        com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                        if (nativeVideoTracking != null && (v10 = nativeVideoTracking.v()) != null) {
                            for (String str : v10) {
                                com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                            }
                        }
                    } catch (Exception e2) {
                        ad.b("MIMManager", e2.getMessage());
                    }
                }
            } catch (Exception e10) {
                ad.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$4 */
    /* loaded from: classes4.dex */
    public class AnonymousClass4 implements Runnable {
        final /* synthetic */ Context a;

        /* renamed from: b */
        final /* synthetic */ CampaignEx f13527b;

        public AnonymousClass4(Context context, CampaignEx campaignEx) {
            r2 = context;
            r3 = campaignEx;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String[] w10;
            try {
                try {
                    Context context = r2;
                    CampaignEx campaignEx = r3;
                    if (campaignEx != null) {
                        try {
                            com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                            if (nativeVideoTracking != null && (w10 = nativeVideoTracking.w()) != null) {
                                for (String str : w10) {
                                    com.mbridge.msdk.click.a.a(context, campaignEx, campaignEx.getCampaignUnitId(), str, false, false);
                                }
                            }
                        } catch (Exception e2) {
                            ad.b("MIMManager", e2.getMessage());
                        }
                    }
                    if (MIMManager.this.f13516d == null || !MIMManager.this.f13516d.contains(r3)) {
                        return;
                    }
                } catch (Throwable th2) {
                    if (MIMManager.this.f13516d != null && MIMManager.this.f13516d.contains(r3)) {
                        MIMManager.this.f13516d.remove(r3);
                    }
                    throw th2;
                }
            } catch (Exception e10) {
                ad.b("MIMManager", e10.getMessage());
                if (MIMManager.this.f13516d == null || !MIMManager.this.f13516d.contains(r3)) {
                    return;
                }
            }
            MIMManager.this.f13516d.remove(r3);
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.tools.MIMManager$5 */
    /* loaded from: classes4.dex */
    public class AnonymousClass5 implements Runnable {
        final /* synthetic */ Context a;

        /* renamed from: b */
        final /* synthetic */ String f13529b;

        /* renamed from: c */
        final /* synthetic */ CampaignEx f13530c;

        /* renamed from: d */
        final /* synthetic */ int f13531d;

        public AnonymousClass5(Context context, String str, CampaignEx campaignEx, int i10) {
            r2 = context;
            r3 = str;
            r4 = campaignEx;
            r5 = i10;
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
                        String str = com.mbridge.msdk.foundation.controller.a.f13020b.get(r4.getCampaignUnitId());
                        StringBuilder sb2 = new StringBuilder("u_stid=");
                        if (str == null) {
                            str = "";
                        }
                        sb2.append(str);
                        sb2.append("&");
                        stringBuffer.append(sb2.toString());
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
            } catch (Throwable th2) {
                ad.b("MIMManager", th2.getMessage());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int i10;
            if (x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("packageName");
                int intExtra = intent.getIntExtra("errorCode", 0);
                if (intExtra < 0) {
                    i10 = intent.getIntExtra("reason", 0);
                } else {
                    i10 = -1;
                }
                ad.b("MIMManager", stringExtra + " " + intExtra + " " + i10);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.d.b bVar = new com.mbridge.msdk.foundation.same.report.d.b();
                        com.mbridge.msdk.foundation.same.report.d.d dVar = new com.mbridge.msdk.foundation.same.report.d.d();
                        dVar.a("key", URLEncoder.encode("m_mini_card", "utf-8"));
                        CampaignEx a = a.a.a(stringExtra);
                        if (a != null) {
                            dVar.a("rid", a.getRequestId());
                            dVar.a("rid_n", a.getRequestIdNotice());
                            dVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, a.getCampaignUnitId());
                            dVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f13020b.get(a.getCampaignUnitId()));
                            bVar.a(a);
                        }
                        dVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        dVar.a("pkg_name", stringExtra);
                        if (i10 != -1) {
                            dVar.a("reasonCode", String.valueOf(i10));
                        }
                        bVar.a("m_mini_card", dVar);
                        com.mbridge.msdk.foundation.same.report.d.c.a().a("m_mini_card", bVar);
                    } catch (Exception e2) {
                        ad.b("MIMManager", e2.getMessage());
                    }
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class a {
        private static final MIMManager a = new MIMManager();
    }

    /* loaded from: classes4.dex */
    public static class b extends BroadcastReceiver {
        private b() {
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:12:0x0033, B:15:0x003a, B:17:0x004b, B:21:0x0052, B:24:0x005d, B:32:0x0083, B:33:0x008a, B:36:0x006f, B:38:0x0075, B:39:0x007b), top: B:11:0x0033 }] */
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
                goto Lb2
            L19:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto L27
                goto Lb2
            L27:
                java.lang.String r1 = "DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"
                java.lang.String r1 = com.mbridge.msdk.foundation.tools.x.a(r1)
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lb2
                android.os.Bundle r10 = r10.getExtras()     // Catch: java.lang.Exception -> La8
                if (r10 != 0) goto L3a
                return
            L3a:
                java.lang.String r0 = "statusCode"
                r1 = -1
                int r7 = r10.getInt(r0, r1)     // Catch: java.lang.Exception -> La8
                java.lang.String r0 = "packageName"
                java.lang.String r2 = ""
                java.lang.String r10 = r10.getString(r0, r2)     // Catch: java.lang.Exception -> La8
                if (r7 == r1) goto La7
                boolean r0 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> La8
                if (r0 == 0) goto L52
                goto La7
            L52:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                com.mbridge.msdk.foundation.entity.CampaignEx r10 = com.mbridge.msdk.foundation.tools.MIMManager.a(r0, r10)     // Catch: java.lang.Exception -> La8
                if (r10 != 0) goto L5d
                return
            L5d:
                com.mbridge.msdk.foundation.tools.MIMManager r0 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                r1 = 3001(0xbb9, float:4.205E-42)
                if (r7 == r1) goto L7b
                r1 = 3002(0xbba, float:4.207E-42)
                if (r7 == r1) goto L75
                r1 = 3008(0xbc0, float:4.215E-42)
                if (r7 == r1) goto L6f
                r10 = 0
                goto L81
            L6f:
                com.mbridge.msdk.foundation.tools.MIMManager$4 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$4     // Catch: java.lang.Exception -> La8
                r1.<init>()     // Catch: java.lang.Exception -> La8
                goto L80
            L75:
                com.mbridge.msdk.foundation.tools.MIMManager$3 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$3     // Catch: java.lang.Exception -> La8
                r1.<init>()     // Catch: java.lang.Exception -> La8
                goto L80
            L7b:
                com.mbridge.msdk.foundation.tools.MIMManager$2 r1 = new com.mbridge.msdk.foundation.tools.MIMManager$2     // Catch: java.lang.Exception -> La8
                r1.<init>()     // Catch: java.lang.Exception -> La8
            L80:
                r10 = r1
            L81:
                if (r10 == 0) goto L8a
                java.util.concurrent.ThreadPoolExecutor r0 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> La8
                r0.execute(r10)     // Catch: java.lang.Exception -> La8
            L8a:
                com.mbridge.msdk.foundation.tools.MIMManager r3 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                java.lang.String r5 = "dm_page_status"
                com.mbridge.msdk.foundation.tools.MIMManager r10 = com.mbridge.msdk.foundation.tools.MIMManager.a.a()     // Catch: java.lang.Exception -> La8
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r10.b()     // Catch: java.lang.Exception -> La8
                java.util.concurrent.ThreadPoolExecutor r10 = com.mbridge.msdk.foundation.same.f.b.b()     // Catch: java.lang.Exception -> La8
                com.mbridge.msdk.foundation.tools.MIMManager$5 r0 = new com.mbridge.msdk.foundation.tools.MIMManager$5     // Catch: java.lang.Exception -> La8
                r2 = r0
                r4 = r9
                r2.<init>()     // Catch: java.lang.Exception -> La8
                r10.execute(r0)     // Catch: java.lang.Exception -> La8
                goto Lb2
            La7:
                return
            La8:
                r9 = move-exception
                java.lang.String r10 = "MIMManager"
                java.lang.String r9 = r9.getMessage()
                com.mbridge.msdk.foundation.tools.ad.b(r10, r9)
            Lb2:
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
        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
        Boolean bool = null;
        if (c10 != null) {
            try {
                if (c10.getContentResolver() != null) {
                    try {
                        cursor = c10.getContentResolver().query(Uri.parse(x.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursor = null;
                    }
                    if (cursor != null) {
                        while (cursor.moveToNext()) {
                            try {
                                String string = cursor.getString(cursor.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase(AbstractJsonLexerKt.NULL) && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    bool = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e2) {
                                ad.a("MIMManager", e2.getMessage());
                            }
                            try {
                                a = cursor.getString(cursor.getColumnIndex("detailStyle"));
                            } catch (Exception e10) {
                                ad.a("MIMManager", e10.getMessage());
                            }
                        }
                        try {
                            cursor.close();
                        } catch (Exception e11) {
                            ad.a("MIMManager", e11.getMessage());
                        }
                    }
                }
            } catch (Exception e12) {
                ad.b("MIMManager", e12.getMessage());
            }
        }
        return bool;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x003f, code lost:
    
        if (r0 == null) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r4 = this;
            int r0 = r4.f13515c
            int r0 = r0 + (-1)
            r4.f13515c = r0
            if (r0 > 0) goto L85
            android.content.Context r0 = r4.f13517e
            java.lang.String r1 = "MIMManager"
            r2 = 0
            if (r0 == 0) goto L52
            com.mbridge.msdk.foundation.tools.MIMManager$b r3 = r4.f13520h     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r3 == 0) goto L18
            com.mbridge.msdk.foundation.tools.MIMManager$b r3 = r4.f13520h     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r0.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
        L18:
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r3 = r4.f13521i     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            if (r3 == 0) goto L21
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r3 = r4.f13521i     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
            r0.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L31 java.lang.Exception -> L33
        L21:
            r4.f13519g = r2
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f13516d
            if (r0 == 0) goto L2a
        L27:
            r0.clear()
        L2a:
            r4.f13516d = r2
            r4.f13520h = r2
            r4.f13517e = r2
            goto L52
        L31:
            r0 = move-exception
            goto L42
        L33:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L31
            com.mbridge.msdk.foundation.tools.ad.a(r1, r0)     // Catch: java.lang.Throwable -> L31
            r4.f13519g = r2
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f13516d
            if (r0 == 0) goto L2a
            goto L27
        L42:
            r4.f13519g = r2
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r4.f13516d
            if (r1 == 0) goto L4b
            r1.clear()
        L4b:
            r4.f13516d = r2
            r4.f13520h = r2
            r4.f13517e = r2
            throw r0
        L52:
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r0 = r4.f13521i     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            if (r0 == 0) goto L85
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.m()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            android.content.Context r0 = r0.c()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            if (r0 == 0) goto L65
            com.mbridge.msdk.foundation.tools.MIMManager$MiOverseaMiniCardBroadcasterReceiver r3 = r4.f13521i     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r0.unregisterReceiver(r3)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
        L65:
            r4.f13519g = r2     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            java.util.concurrent.CopyOnWriteArrayList<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f13516d     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            if (r0 == 0) goto L6e
            r0.clear()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
        L6e:
            r4.f13516d = r2     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            r4.f13521i = r2     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L75
            goto L85
        L73:
            r0 = move-exception
            goto L7e
        L75:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L73
            com.mbridge.msdk.foundation.tools.ad.a(r1, r0)     // Catch: java.lang.Throwable -> L73
            goto L85
        L7e:
            java.lang.String r0 = r0.getMessage()
            com.mbridge.msdk.foundation.tools.ad.b(r1, r0)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.MIMManager.f():void");
    }

    private MIMManager() {
        this.f13515c = 0;
        this.f13516d = new CopyOnWriteArrayList<>();
        this.f13514b = new AtomicBoolean(false);
    }

    public final CampaignEx b() {
        return this.f13519g;
    }

    public final String c() {
        try {
            return a == null ? "" : String.format("[%s]", a);
        } catch (Exception unused) {
            return "";
        }
    }

    public final Boolean d() {
        return this.f13518f;
    }

    public final void e() {
        this.f13515c++;
    }

    public final void b(CampaignEx campaignEx) {
        try {
            if (this.f13518f == null || campaignEx == null || !this.f13518f.booleanValue()) {
                return;
            }
            this.f13519g = null;
            try {
                this.f13516d.remove(campaignEx);
            } catch (Exception e2) {
                ad.a("MIMManager", e2.getMessage());
            }
        } catch (Exception e10) {
            ad.b("MIMManager", e10.getMessage());
        }
    }

    public static MIMManager a() {
        return a.a;
    }

    public final void a(CampaignEx campaignEx) {
        try {
            if (this.f13518f != null && campaignEx != null && this.f13518f.booleanValue()) {
                this.f13519g = campaignEx;
                this.f13516d.add(campaignEx);
            }
            if (com.mbridge.msdk.e.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f13521i == null) {
                    try {
                        if (this.f13521i == null) {
                            this.f13521i = new MiOverseaMiniCardBroadcasterReceiver();
                        }
                        IntentFilter intentFilter = new IntentFilter(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
                        Context c10 = com.mbridge.msdk.foundation.controller.c.m().c();
                        if (c10 != null) {
                            c10.registerReceiver(this.f13521i, intentFilter);
                        }
                    } catch (Exception e2) {
                        ad.a("MIMManager", e2.getMessage());
                    }
                }
                this.f13519g = campaignEx;
                this.f13516d.add(campaignEx);
            }
        } catch (Exception e10) {
            ad.b("MIMManager", e10.getMessage());
        }
    }

    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f13519g;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f13519g;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f13516d;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            Iterator<CampaignEx> it = this.f13516d.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e2) {
            ad.b("MIMManager", e2.getMessage());
            return null;
        }
    }

    public final void a(Context context) {
        this.f13517e = context;
        com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.tools.MIMManager.1
            final /* synthetic */ Context a;

            public AnonymousClass1(Context context2) {
                r2 = context2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (MIMManager.this.f13514b.compareAndSet(false, true)) {
                    try {
                        MIMManager mIMManager = MIMManager.this;
                        mIMManager.f13518f = mIMManager.g();
                    } catch (Exception e2) {
                        ad.a("MIMManager", e2.getMessage());
                    }
                    if (MIMManager.this.f13518f != null && MIMManager.this.f13518f.booleanValue() && r2 != null) {
                        try {
                            MIMManager.this.f13520h = new b();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                            intentFilter.addAction(x.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                            r2.registerReceiver(MIMManager.this.f13520h, intentFilter);
                        } catch (Exception e10) {
                            ad.a("MIMManager", e10.getMessage());
                        }
                    }
                }
            }
        });
    }
}
