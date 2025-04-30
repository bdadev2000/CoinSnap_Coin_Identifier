package E1;

import B1.e;
import D0.k;
import D0.l;
import J1.q;
import N1.i;
import P1.j;
import P1.m;
import Q7.InterfaceC0237e;
import T.C0268f;
import T.InterfaceC0262c;
import T1.A;
import T1.C0297c;
import T1.D;
import T1.F;
import T1.G;
import T1.u;
import T1.v;
import U.t;
import U0.n;
import a7.C0399a;
import android.app.Activity;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.ContentInfo;
import android.view.View;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import androidx.core.app.C0414o;
import androidx.core.app.NotificationCompat;
import androidx.viewpager2.widget.ViewPager2;
import b1.h;
import b3.C0563h;
import b3.C0568m;
import c6.InterfaceC0613a;
import c6.InterfaceC0614b;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardItem;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener;
import com.facebook.appevents.g;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.internal.play_billing.zzai;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.tools.arruler.photomeasure.camera.ruler.R;
import com.tools.arruler.ui.component.home.HomeActivity;
import com.tools.arruler.ui.component.splash.SplashActivity;
import e1.f;
import e6.AbstractC2223a;
import e6.AbstractC2224b;
import f6.C2272a;
import g4.AbstractC2292b;
import h.C2310a;
import j5.C2400c;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k2.InterfaceC2429a;
import m4.AbstractC2466a;
import n1.C2475f;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import q4.C2643b;
import t7.AbstractC2712a;
import u4.AbstractC2762g;
import u4.C2781z;
import w4.v0;
import x0.AbstractC2914a;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class c implements e, SuccessContinuation, A5.d, h.b, InterfaceC2429a, t, InterfaceC0262c, v, N1.b, F, T7.b, n, OnCompleteListener, PAGInterstitialAdInteractionListener, PAGRewardedAdInteractionListener, InterfaceC0614b {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public Object f972c;

    public /* synthetic */ c(int i9, boolean z8) {
        this.b = i9;
    }

    public static k A(I0.b bVar) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap.put("prerequisite_id", new F0.a(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        hashSet.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new F0.d("index_Dependency_work_spec_id", Arrays.asList("work_spec_id"), false));
        hashSet2.add(new F0.d("index_Dependency_prerequisite_id", Arrays.asList("prerequisite_id"), false));
        F0.e eVar = new F0.e("Dependency", hashMap, hashSet, hashSet2);
        F0.e a6 = F0.e.a(bVar, "Dependency");
        if (!eVar.equals(a6)) {
            return new k(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a6);
        }
        HashMap hashMap2 = new HashMap(25);
        hashMap2.put("id", new F0.a(1, "id", "TEXT", null, true, 1));
        hashMap2.put("state", new F0.a(0, "state", "INTEGER", null, true, 1));
        hashMap2.put("worker_class_name", new F0.a(0, "worker_class_name", "TEXT", null, true, 1));
        hashMap2.put("input_merger_class_name", new F0.a(0, "input_merger_class_name", "TEXT", null, false, 1));
        hashMap2.put("input", new F0.a(0, "input", "BLOB", null, true, 1));
        hashMap2.put("output", new F0.a(0, "output", "BLOB", null, true, 1));
        hashMap2.put("initial_delay", new F0.a(0, "initial_delay", "INTEGER", null, true, 1));
        hashMap2.put("interval_duration", new F0.a(0, "interval_duration", "INTEGER", null, true, 1));
        hashMap2.put("flex_duration", new F0.a(0, "flex_duration", "INTEGER", null, true, 1));
        hashMap2.put("run_attempt_count", new F0.a(0, "run_attempt_count", "INTEGER", null, true, 1));
        hashMap2.put("backoff_policy", new F0.a(0, "backoff_policy", "INTEGER", null, true, 1));
        hashMap2.put("backoff_delay_duration", new F0.a(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        hashMap2.put("period_start_time", new F0.a(0, "period_start_time", "INTEGER", null, true, 1));
        hashMap2.put("minimum_retention_duration", new F0.a(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        hashMap2.put("schedule_requested_at", new F0.a(0, "schedule_requested_at", "INTEGER", null, true, 1));
        hashMap2.put("run_in_foreground", new F0.a(0, "run_in_foreground", "INTEGER", null, true, 1));
        hashMap2.put("out_of_quota_policy", new F0.a(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        hashMap2.put("required_network_type", new F0.a(0, "required_network_type", "INTEGER", null, false, 1));
        hashMap2.put("requires_charging", new F0.a(0, "requires_charging", "INTEGER", null, true, 1));
        hashMap2.put("requires_device_idle", new F0.a(0, "requires_device_idle", "INTEGER", null, true, 1));
        hashMap2.put("requires_battery_not_low", new F0.a(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        hashMap2.put("requires_storage_not_low", new F0.a(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        hashMap2.put("trigger_content_update_delay", new F0.a(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        hashMap2.put("trigger_max_content_delay", new F0.a(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        hashMap2.put("content_uri_triggers", new F0.a(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new F0.d("index_WorkSpec_schedule_requested_at", Arrays.asList("schedule_requested_at"), false));
        hashSet4.add(new F0.d("index_WorkSpec_period_start_time", Arrays.asList("period_start_time"), false));
        F0.e eVar2 = new F0.e("WorkSpec", hashMap2, hashSet3, hashSet4);
        F0.e a9 = F0.e.a(bVar, "WorkSpec");
        if (!eVar2.equals(a9)) {
            return new k(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a9);
        }
        HashMap hashMap3 = new HashMap(2);
        hashMap3.put("tag", new F0.a(1, "tag", "TEXT", null, true, 1));
        hashMap3.put("work_spec_id", new F0.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new F0.d("index_WorkTag_work_spec_id", Arrays.asList("work_spec_id"), false));
        F0.e eVar3 = new F0.e("WorkTag", hashMap3, hashSet5, hashSet6);
        F0.e a10 = F0.e.a(bVar, "WorkTag");
        if (!eVar3.equals(a10)) {
            return new k(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a10);
        }
        HashMap hashMap4 = new HashMap(2);
        hashMap4.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap4.put("system_id", new F0.a(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        F0.e eVar4 = new F0.e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
        F0.e a11 = F0.e.a(bVar, "SystemIdInfo");
        if (!eVar4.equals(a11)) {
            return new k(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a11);
        }
        HashMap hashMap5 = new HashMap(2);
        hashMap5.put("name", new F0.a(1, "name", "TEXT", null, true, 1));
        hashMap5.put("work_spec_id", new F0.a(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new F0.d("index_WorkName_work_spec_id", Arrays.asList("work_spec_id"), false));
        F0.e eVar5 = new F0.e("WorkName", hashMap5, hashSet8, hashSet9);
        F0.e a12 = F0.e.a(bVar, "WorkName");
        if (!eVar5.equals(a12)) {
            return new k(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a12);
        }
        HashMap hashMap6 = new HashMap(2);
        hashMap6.put("work_spec_id", new F0.a(1, "work_spec_id", "TEXT", null, true, 1));
        hashMap6.put(NotificationCompat.CATEGORY_PROGRESS, new F0.a(0, NotificationCompat.CATEGORY_PROGRESS, "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new F0.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
        F0.e eVar6 = new F0.e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
        F0.e a13 = F0.e.a(bVar, "WorkProgress");
        if (!eVar6.equals(a13)) {
            return new k(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a13);
        }
        HashMap hashMap7 = new HashMap(2);
        hashMap7.put("key", new F0.a(1, "key", "TEXT", null, true, 1));
        hashMap7.put("long_value", new F0.a(0, "long_value", "INTEGER", null, false, 1));
        F0.e eVar7 = new F0.e("Preference", hashMap7, new HashSet(0), new HashSet(0));
        F0.e a14 = F0.e.a(bVar, "Preference");
        if (!eVar7.equals(a14)) {
            return new k(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a14);
        }
        return new k(true, (String) null);
    }

    public static void q(I0.b bVar) {
        bVar.l("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        bVar.l("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        bVar.l("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        bVar.l("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        bVar.l("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static String r(String str, b bVar, boolean z8) {
        String str2 = bVar.b;
        if (z8) {
            str2 = AbstractC2914a.d(".temp", str2);
        }
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance(SameMD5.TAG).digest(replaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    sb.append(String.format("%02x", Byte.valueOf(b)));
                }
                replaceAll = sb.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return AbstractC2914a.e("lottie_cache_", replaceAll, str2);
    }

    public File B() {
        C2781z c2781z = (C2781z) this.f972c;
        c2781z.getClass();
        File file = new File(((Context) c2781z.f23185c).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public void C(Activity activity) {
        C0414o c0414o = (C0414o) this.f972c;
        ArrayList arrayList = c0414o.f4421c;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(c0414o.f4422d);
    }

    public File D(String str, InputStream inputStream, b bVar) {
        File file = new File(B(), r(str, bVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } finally {
            inputStream.close();
        }
    }

    public String E() {
        return ((q) ((zzai) this.f972c).get(0)).a();
    }

    @Override // c6.InterfaceC0614b
    public JSONObject a(View view) {
        int currentModeType;
        JSONObject a6 = AbstractC2224b.a(0, 0, 0, 0);
        UiModeManager uiModeManager = com.facebook.appevents.n.f13498a;
        try {
            a6.put("noOutputDevice", AbstractC2223a.f20112a[AbstractC2965e.d((uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : AbstractC2292b.f20428a)] == 1);
        } catch (JSONException e4) {
            f.a("Error with setting output device status", e4);
        }
        return a6;
    }

    @Override // h.b
    public void b(Object obj) {
        Bundle extras;
        C2310a c2310a = (C2310a) obj;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f972c;
        proxyBillingActivityV2.getClass();
        Intent intent = c2310a.f20551c;
        int i9 = zzb.zze(intent, "ProxyBillingActivityV2").f1520a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.f5612d;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i9, extras);
        }
        int i10 = c2310a.b;
        if (i10 != -1 || i9 != 0) {
            zzb.zzk("ProxyBillingActivityV2", "Alternative billing only dialog finished with resultCode " + i10 + " and billing's responseCode: " + i9);
        }
        proxyBillingActivityV2.finish();
    }

    @Override // T.InterfaceC0262c
    public C0268f build() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f972c).build();
        return new C0268f(new C2400c(build));
    }

    @Override // U.t
    public boolean c(View view) {
        int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
        ViewPager2 viewPager2 = (ViewPager2) ((h) this.f972c).f5272f;
        if (viewPager2.f5181t) {
            viewPager2.b(currentItem);
        }
        return true;
    }

    @Override // U0.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) y8.a.c(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f972c).createWebView(webView));
    }

    @Override // T.InterfaceC0262c
    public void d(Uri uri) {
        ((ContentInfo.Builder) this.f972c).setLinkUri(uri);
    }

    @Override // k2.InterfaceC2429a
    public Object e() {
        l lVar = (l) this.f972c;
        return new j((m) lVar.f626c, (C.c) lVar.f627d);
    }

    @Override // T.InterfaceC0262c
    public void f(int i9) {
        ((ContentInfo.Builder) this.f972c).setFlags(i9);
    }

    @Override // B1.e
    public y1.e g() {
        List list = (List) this.f972c;
        if (((I1.a) list.get(0)).c()) {
            return new y1.j(list, 1);
        }
        return new y1.m(list);
    }

    @Override // U0.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) y8.a.c(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f972c).getStatics());
    }

    @Override // T1.F
    public com.bumptech.glide.load.data.e h(Uri uri) {
        return new com.bumptech.glide.load.data.b(1, uri, (ContentResolver) this.f972c);
    }

    @Override // T1.v
    public u i(A a6) {
        switch (this.b) {
            case 15:
                return new C0297c((D) this.f972c, 1);
            default:
                return new G(this);
        }
    }

    @Override // B1.e
    public List j() {
        return (List) this.f972c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // T7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object k(T7.c r7, w7.f r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof T7.a
            if (r0 == 0) goto L13
            r0 = r8
            T7.a r0 = (T7.a) r0
            int r1 = r0.f3034i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3034i = r1
            goto L18
        L13:
            T7.a r0 = new T7.a
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f3032g
            x7.a r1 = x7.EnumC2928a.b
            int r2 = r0.f3034i
            t7.y r3 = t7.y.f23029a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            U7.r r7 = r0.f3031f
            t7.AbstractC2712a.f(r8)     // Catch: java.lang.Throwable -> L2b
            goto L56
        L2b:
            r8 = move-exception
            goto L60
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            t7.AbstractC2712a.f(r8)
            U7.r r8 = new U7.r
            w7.k r2 = r0.f24446c
            G7.j.b(r2)
            r8.<init>(r7, r2)
            r0.f3031f = r8     // Catch: java.lang.Throwable -> L5e
            r0.f3034i = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r6.f972c     // Catch: java.lang.Throwable -> L5e
            F7.p r7 = (F7.p) r7     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r7 = r7.g(r8, r0)     // Catch: java.lang.Throwable -> L5e
            if (r7 != r1) goto L51
            goto L52
        L51:
            r7 = r3
        L52:
            if (r7 != r1) goto L55
            return r1
        L55:
            r7 = r8
        L56:
            r7.j()
            return r3
        L5a:
            r5 = r8
            r8 = r7
            r7 = r5
            goto L60
        L5e:
            r7 = move-exception
            goto L5a
        L60:
            r7.j()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: E1.c.k(T7.c, w7.f):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c6.InterfaceC0614b
    public void l(View view, JSONObject jSONObject, InterfaceC0613a interfaceC0613a, boolean z8, boolean z9) {
        ArrayList arrayList = new ArrayList();
        b6.c cVar = b6.c.f5337c;
        if (cVar != null) {
            Collection unmodifiableCollection = Collections.unmodifiableCollection(cVar.b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            Iterator it = unmodifiableCollection.iterator();
            while (it.hasNext()) {
                View view2 = (View) ((Z5.h) it.next()).f3900d.get();
                if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                    View view3 = view2;
                    while (true) {
                        if (view3 != null) {
                            if (view3.getAlpha() == 0.0f) {
                                break;
                            }
                            Object parent = view3.getParent();
                            if (parent instanceof View) {
                                view3 = (View) parent;
                            } else {
                                view3 = null;
                            }
                        } else {
                            View rootView = view2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z10 = rootView.getZ();
                                int size = arrayList.size();
                                while (size > 0 && ((View) arrayList.get(size - 1)).getZ() > z10) {
                                    size--;
                                }
                                arrayList.add(size, rootView);
                            }
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C2272a) interfaceC0613a).a((View) it2.next(), (InterfaceC0614b) this.f972c, jSONObject, z9);
        }
    }

    @Override // N1.b
    public boolean m(Object obj, File file, i iVar) {
        InputStream inputStream = (InputStream) obj;
        Q1.f fVar = (Q1.f) this.f972c;
        byte[] bArr = (byte[]) fVar.c(65536, byte[].class);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = inputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, read);
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream = fileOutputStream2;
                        if (Log.isLoggable("StreamEncoder", 3)) {
                            Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        fVar.g(bArr);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        fVar.g(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
                fVar.g(bArr);
                return true;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e9) {
            e = e9;
        }
    }

    @Override // A5.d
    public D5.b n(String str, int i9, EnumMap enumMap) {
        if (i9 == 15) {
            return ((H5.f) this.f972c).n("0".concat(String.valueOf(str)), 8, enumMap);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(AbstractC2914a.m(i9)));
    }

    @Override // B1.e
    public boolean o() {
        List list = (List) this.f972c;
        if (list.size() != 1 || !((I1.a) list.get(0)).c()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdClicked() {
        switch (this.b) {
            case 27:
                MediationInterstitialAdCallback mediationInterstitialAdCallback = ((C0563h) this.f972c).f5298g;
                if (mediationInterstitialAdCallback != null) {
                    mediationInterstitialAdCallback.reportAdClicked();
                    return;
                }
                return;
            default:
                MediationRewardedAdCallback mediationRewardedAdCallback = ((C0568m) this.f972c).f5314g;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.reportAdClicked();
                    return;
                }
                return;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdDismissed() {
        switch (this.b) {
            case 27:
                MediationInterstitialAdCallback mediationInterstitialAdCallback = ((C0563h) this.f972c).f5298g;
                if (mediationInterstitialAdCallback != null) {
                    mediationInterstitialAdCallback.onAdClosed();
                    return;
                }
                return;
            default:
                MediationRewardedAdCallback mediationRewardedAdCallback = ((C0568m) this.f972c).f5314g;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onAdClosed();
                    return;
                }
                return;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
    public void onAdShowed() {
        switch (this.b) {
            case 27:
                C0563h c0563h = (C0563h) this.f972c;
                MediationInterstitialAdCallback mediationInterstitialAdCallback = c0563h.f5298g;
                if (mediationInterstitialAdCallback != null) {
                    mediationInterstitialAdCallback.onAdOpened();
                    c0563h.f5298g.reportAdImpression();
                    return;
                }
                return;
            default:
                C0568m c0568m = (C0568m) this.f972c;
                MediationRewardedAdCallback mediationRewardedAdCallback = c0568m.f5314g;
                if (mediationRewardedAdCallback != null) {
                    mediationRewardedAdCallback.onAdOpened();
                    c0568m.f5314g.reportAdImpression();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        InterfaceC0237e interfaceC0237e = (InterfaceC0237e) this.f972c;
        if (exception == null) {
            if (task.isCanceled()) {
                interfaceC0237e.l(null);
                return;
            } else {
                interfaceC0237e.e(task.getResult());
                return;
            }
        }
        interfaceC0237e.e(AbstractC2712a.b(exception));
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedReward(PAGRewardItem pAGRewardItem) {
        C2475f c2475f = new C2475f(pAGRewardItem, 25);
        MediationRewardedAdCallback mediationRewardedAdCallback = ((C0568m) this.f972c).f5314g;
        if (mediationRewardedAdCallback != null) {
            mediationRewardedAdCallback.onUserEarnedReward(c2475f);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdInteractionListener
    public void onUserEarnedRewardFail(int i9, String str) {
        Log.d(PangleMediationAdapter.TAG, v0.i(i9, "Failed to reward user: " + str).toString());
    }

    public File s(String str) {
        File file = new File(B(), r(str, b.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(B(), r(str, b.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(B(), r(str, b.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    @Override // T.InterfaceC0262c
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f972c).setExtras(bundle);
    }

    public Activity t() {
        switch (this.b) {
            case 4:
                return (HomeActivity) this.f972c;
            default:
                return (SplashActivity) this.f972c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v4, types: [j5.c] */
    /* JADX WARN: Type inference failed for: r4v1, types: [long] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [l5.k, java.lang.Object] */
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ?? r12;
        FileWriter fileWriter;
        B4.c cVar = (B4.c) this.f972c;
        a7.b bVar = (a7.b) cVar.f320f;
        B4.e eVar = (B4.e) cVar.b;
        String str = (String) bVar.f4077c;
        Closeable closeable = null;
        try {
            HashMap q9 = a7.b.q(eVar);
            ((C2643b) bVar.f4078d).getClass();
            ?? obj2 = new Object();
            obj2.b = str;
            obj2.f21620c = q9;
            obj2.f21619a = new HashMap();
            HashMap hashMap = (HashMap) obj2.f21619a;
            hashMap.put(Command.HTTP_HEADER_USER_AGENT, "Crashlytics Android SDK/19.0.3");
            hashMap.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            a7.b.i(obj2, eVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + q9;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            r12 = bVar.s(obj2.c());
        } catch (IOException e4) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e4);
            r12 = 0;
        }
        if (r12 != 0) {
            B4.b n2 = ((C2400c) cVar.f317c).n(r12);
            ?? r42 = n2.f312c;
            C2475f c2475f = (C2475f) cVar.f319e;
            c2475f.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                try {
                    try {
                        r12.put("expires_at", r42);
                    } catch (Exception e9) {
                        e = e9;
                    }
                    try {
                        fileWriter = new FileWriter((File) c2475f.f21833c);
                        try {
                            fileWriter.write(r12.toString());
                            fileWriter.flush();
                            r42 = fileWriter;
                        } catch (Exception e10) {
                            e = e10;
                            Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            r42 = fileWriter;
                            AbstractC2762g.c(r42, "Failed to close settings writer.");
                            B4.c.l("Loaded settings: ", r12);
                            String str4 = eVar.f328f;
                            SharedPreferences.Editor edit = ((Context) cVar.f316a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                            edit.putString("existing_instance_identifier", str4);
                            edit.apply();
                            ((AtomicReference) cVar.f322h).set(n2);
                            ((TaskCompletionSource) ((AtomicReference) cVar.f323i).get()).trySetResult(n2);
                            return Tasks.forResult(null);
                        }
                    } catch (Exception e11) {
                        e = e11;
                        fileWriter = null;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        r42 = fileWriter;
                        AbstractC2762g.c(r42, "Failed to close settings writer.");
                        B4.c.l("Loaded settings: ", r12);
                        String str42 = eVar.f328f;
                        SharedPreferences.Editor edit2 = ((Context) cVar.f316a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit2.putString("existing_instance_identifier", str42);
                        edit2.apply();
                        ((AtomicReference) cVar.f322h).set(n2);
                        ((TaskCompletionSource) ((AtomicReference) cVar.f323i).get()).trySetResult(n2);
                        return Tasks.forResult(null);
                    }
                    AbstractC2762g.c(r42, "Failed to close settings writer.");
                    B4.c.l("Loaded settings: ", r12);
                    String str422 = eVar.f328f;
                    SharedPreferences.Editor edit22 = ((Context) cVar.f316a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    edit22.putString("existing_instance_identifier", str422);
                    edit22.apply();
                    ((AtomicReference) cVar.f322h).set(n2);
                    ((TaskCompletionSource) ((AtomicReference) cVar.f323i).get()).trySetResult(n2);
                } catch (Throwable th) {
                    th = th;
                    AbstractC2762g.c(closeable, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeable = r42;
                AbstractC2762g.c(closeable, "Failed to close settings writer.");
                throw th;
            }
        }
        return Tasks.forResult(null);
    }

    public void u(FormError formError) {
        int i9 = this.b;
        G7.j.e(formError, "formError");
        switch (i9) {
            case 4:
                int i10 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "consent_error_2");
                return;
            default:
                SplashActivity splashActivity = (SplashActivity) this.f972c;
                splashActivity.getClass();
                int i11 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "consent_error_1");
                new W6.d(splashActivity).start();
                return;
        }
    }

    public void v(int i9) {
        switch (this.b) {
            case 4:
                return;
            default:
                ((SplashActivity) this.f972c).getClass();
                return;
        }
    }

    public void x(boolean z8) {
        switch (this.b) {
            case 4:
                if (z8) {
                    int i9 = C0399a.f4075a;
                    AbstractC2466a.a().a(null, "agree_consent_2");
                    HomeActivity homeActivity = (HomeActivity) this.f972c;
                    z2.i.p("key_confirm_consent", Boolean.TRUE, homeActivity.n());
                    Intent intent = new Intent(homeActivity, (Class<?>) SplashActivity.class);
                    intent.putExtra("key_tracking_screen_from", "HomeActivity");
                    homeActivity.startActivity(intent);
                    homeActivity.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    return;
                }
                int i10 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "refuse_consent_2");
                ConsentInformation consentInformation = g.b;
                if (consentInformation != null) {
                    consentInformation.reset();
                    return;
                }
                return;
            default:
                SplashActivity splashActivity = (SplashActivity) this.f972c;
                splashActivity.getClass();
                if (z8) {
                    int i11 = C0399a.f4075a;
                    AbstractC2466a.a().a(null, "new_agree_consent_1");
                    z2.i.p("key_confirm_consent", Boolean.TRUE, splashActivity.n());
                } else {
                    ConsentInformation consentInformation2 = g.b;
                    if (consentInformation2 != null) {
                        consentInformation2.reset();
                    }
                    int i12 = C0399a.f4075a;
                    AbstractC2466a.a().a(null, "new_refuse_consent_1");
                }
                new W6.d(splashActivity).start();
                return;
        }
    }

    public void y() {
        switch (this.b) {
            case 4:
                int i9 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "not_using_display_consent_2");
                z2.i.p("key_is_user_global", Boolean.TRUE, ((HomeActivity) this.f972c).n());
                return;
            default:
                int i10 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "new_not_using_display_consent_1");
                SplashActivity splashActivity = (SplashActivity) this.f972c;
                z2.i.p("key_is_user_global", Boolean.TRUE, splashActivity.n());
                new W6.d(splashActivity).start();
                return;
        }
    }

    public void z() {
        switch (this.b) {
            case 4:
                int i9 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "display_consent_2");
                return;
            default:
                int i10 = C0399a.f4075a;
                AbstractC2466a.a().a(null, "new_display_consent_1");
                return;
        }
    }

    public /* synthetic */ c(Object obj, int i9) {
        this.b = i9;
        this.f972c = obj;
    }

    public /* synthetic */ c(C2475f c2475f) {
        this.b = 6;
        this.f972c = (zzai) c2475f.f21833c;
    }

    public c(int i9) {
        this.b = i9;
        switch (i9) {
            case 10:
                this.f972c = new ArrayDeque();
                return;
            case 15:
                this.f972c = new D(7);
                return;
            case 16:
                this.f972c = new HashMap();
                return;
            case 26:
                this.f972c = new C0414o();
                return;
            default:
                this.f972c = new H5.f(0);
                return;
        }
    }

    @Override // U0.n
    public String[] a() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f972c).getSupportedFeatures();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [n1.f, java.lang.Object, T.D] */
    public c(View view) {
        this.b = 14;
        if (Build.VERSION.SDK_INT >= 30) {
            ?? c2475f = new C2475f(view, 10);
            c2475f.f2854f = view;
            this.f972c = c2475f;
            return;
        }
        this.f972c = new C2475f(view, 10);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [n1.f, java.lang.Object, T.D] */
    public c(WindowInsetsController windowInsetsController) {
        this.b = 14;
        ?? c2475f = new C2475f((Object) null, 10);
        c2475f.f2855g = windowInsetsController;
        this.f972c = c2475f;
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.b = 24;
        if (Build.VERSION.SDK_INT >= 25) {
            this.f972c = new Y.f(uri, clipDescription, uri2);
        } else {
            this.f972c = new C.c(uri, clipDescription, uri2, 12);
        }
    }

    private final void w(int i9) {
    }

    public c(ClipData clipData, int i9) {
        this.b = 13;
        this.f972c = B3.a.l(clipData, i9);
    }
}
