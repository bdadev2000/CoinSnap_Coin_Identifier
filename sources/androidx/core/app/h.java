package androidx.core.app;

import android.content.ClipData;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.c2;
import com.applovin.impl.av;
import com.applovin.impl.ql;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.plantcare.ai.identifier.plantid.ui.component.splash.SplashActivity;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.tasks.TasksKt;
import s7.f2;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements j0.d, OnPaidEventListener, n.a, com.facebook.internal.s, p7.b, o7.h, n9.l, n9.c, y7.c, k8.y, cc.a, db.d, OnCompleteListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1189c;

    public /* synthetic */ h(Object obj, int i10) {
        this.f1188b = i10;
        this.f1189c = obj;
    }

    @Override // y7.c
    public long a(long j3) {
        return n9.h0.i((j3 * r0.f27997e) / 1000000, 0L, ((y7.s) this.f1189c).f28002j - 1);
    }

    @Override // n9.c
    public void accept(Object obj) {
        ((x7.q) obj).e((Exception) this.f1189c);
    }

    @Override // n.a, o7.h
    public Object apply(Object obj) {
        InputStream inputStream;
        int i10 = this.f1188b;
        Object obj2 = this.f1189c;
        switch (i10) {
            case 5:
                return com.applovin.impl.sdk.ad.b.G((n.a) obj2, (ql) obj);
            case 8:
                g7.d dVar = (g7.d) obj2;
                g7.b bVar = (g7.b) obj;
                dVar.getClass();
                URL url = bVar.a;
                String C = com.bumptech.glide.c.C("CctTransportBackend");
                if (Log.isLoggable(C, 4)) {
                    Log.i(C, String.format("Making request to: %s", url));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(dVar.f18242g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, String.format("datatransport/%s android/", "3.3.0"));
                httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                String str = bVar.f18234c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        try {
                            dVar.a.e(bVar.f18233b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                            gZIPOutputStream.close();
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            int responseCode = httpURLConnection.getResponseCode();
                            Integer valueOf = Integer.valueOf(responseCode);
                            String C2 = com.bumptech.glide.c.C("CctTransportBackend");
                            if (Log.isLoggable(C2, 4)) {
                                Log.i(C2, String.format("Status Code: %d", valueOf));
                            }
                            com.bumptech.glide.c.q("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                            com.bumptech.glide.c.q("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                            if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                                if (responseCode != 200) {
                                    return new g7.c(responseCode, null, 0L);
                                }
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                try {
                                    if ("gzip".equals(httpURLConnection.getHeaderField("Content-Encoding"))) {
                                        inputStream = new GZIPInputStream(inputStream2);
                                    } else {
                                        inputStream = inputStream2;
                                    }
                                    try {
                                        g7.c cVar = new g7.c(responseCode, null, h7.v.a(new BufferedReader(new InputStreamReader(inputStream))).a);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        return cVar;
                                    } finally {
                                    }
                                } finally {
                                }
                            } else {
                                return new g7.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (ConnectException e2) {
                    e = e2;
                    com.bumptech.glide.c.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new g7.c(500, null, 0L);
                } catch (UnknownHostException e10) {
                    e = e10;
                    com.bumptech.glide.c.r("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new g7.c(500, null, 0L);
                } catch (IOException e11) {
                    e = e11;
                    com.bumptech.glide.c.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new g7.c(400, null, 0L);
                } catch (vb.b e12) {
                    e = e12;
                    com.bumptech.glide.c.r("CctTransportBackend", "Couldn't encode request, returning with 400", e);
                    return new g7.c(400, null, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                f7.c cVar2 = o7.j.f23150h;
                while (cursor.moveToNext()) {
                    long j3 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j3));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j3), set);
                    }
                    set.add(new o7.i(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // com.facebook.internal.s
    public void b(boolean z10) {
        boolean z11;
        String str = (String) this.f1189c;
        int i10 = com.facebook.q.f11360b;
        if (z10) {
            try {
                n6.a aVar = new n6.a(str);
                if (aVar.f22459b != null && aVar.f22460c != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    com.facebook.appevents.g.N(aVar.a, aVar.toString());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:5|(1:7)(1:171)|8|(1:170)(2:12|(1:168)(33:16|(2:19|17)|20|21|22|(2:25|23)|26|27|28|29|(1:31)(1:165)|32|(1:34)|35|36|(4:39|(2:41|42)(1:44)|43|37)|45|46|(2:49|47)|50|51|(1:53)(1:163)|54|(1:56)(1:162)|57|(5:149|(1:151)|152|3a2|157)(1:61)|62|(6:66|(1:68)(2:145|(1:147))|69|(1:71)(2:142|(2:144|(26:74|75|76|77|78|79|80|81|82|83|84|85|86|87|88|89|90|91|92|(5:94|(1:96)(1:122)|(4:98|(2:100|(1:102))|104|(10:106|107|108|109|110|(1:112)|113|114|(1:116)|117))|121|(0))|123|(0)|113|114|(0)|117)(2:140|141)))|72|(0)(0))|148|69|(0)(0)|72|(0)(0)))|169|22|(1:23)|26|27|28|29|(0)(0)|32|(0)|35|36|(1:37)|45|46|(1:47)|50|51|(0)(0)|54|(0)(0)|57|(1:59)|149|(0)|152|3a2) */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x05e9, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x05ea, code lost:
    
        r3 = r15;
        r3.e("Error retrieving app package info.", r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021e A[Catch: NameNotFoundException -> 0x05e9, TryCatch #1 {NameNotFoundException -> 0x05e9, blocks: (B:29:0x01fe, B:31:0x0215, B:32:0x0224, B:35:0x022b, B:165:0x021e), top: B:28:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01d6 A[LOOP:1: B:23:0x01d0->B:25:0x01d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0215 A[Catch: NameNotFoundException -> 0x05e9, TryCatch #1 {NameNotFoundException -> 0x05e9, blocks: (B:29:0x01fe, B:31:0x0215, B:32:0x0224, B:35:0x022b, B:165:0x021e), top: B:28:0x01fe }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02fa A[LOOP:3: B:47:0x02f4->B:49:0x02fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x045e  */
    @Override // db.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(ob.c r45) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.h.c(ob.c):java.lang.Object");
    }

    @Override // j0.d
    public void d() {
        c2 this$0 = (c2) this.f1189c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.a();
    }

    public boolean e(f.a aVar, int i10, Bundle bundle) {
        View view = (View) this.f1189c;
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                ((s0.e) aVar.f17509c).g();
                Parcelable parcelable = (Parcelable) ((s0.e) aVar.f17509c).e();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
            }
        }
        f.a aVar2 = new f.a(new ClipData(((s0.e) aVar.f17509c).getDescription(), new ClipData.Item(((s0.e) aVar.f17509c).f())), 2);
        ((n0.d) aVar2.f17509c).a(((s0.e) aVar.f17509c).h());
        ((n0.d) aVar2.f17509c).setExtras(bundle);
        if (ViewCompat.performReceiveContent(view, ((n0.d) aVar2.f17509c).build()) == null) {
            return true;
        }
        return false;
    }

    @Override // p7.b
    public Object execute() {
        int i10 = this.f1188b;
        int i11 = 1;
        int i12 = 0;
        Object obj = this.f1189c;
        switch (i10) {
            case 9:
                o7.j jVar = (o7.j) ((o7.d) obj);
                return Integer.valueOf(((Integer) jVar.j(new av(jVar, ((q7.b) jVar.f23152c).a() - jVar.f23154f.f23138d, i11))).intValue());
            case 10:
                o7.j jVar2 = (o7.j) ((n7.i) obj).f22493i;
                jVar2.getClass();
                jVar2.j(new o7.f(jVar2, i12));
                return null;
            case 11:
                o7.j jVar3 = (o7.j) ((o7.c) obj);
                jVar3.getClass();
                int i13 = l7.a.f21140e;
                int i14 = 6;
                ic.t tVar = new ic.t(6);
                HashMap hashMap = new HashMap();
                SQLiteDatabase d10 = jVar3.d();
                d10.beginTransaction();
                try {
                    l7.a aVar = (l7.a) o7.j.s(d10.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new f2.i(i14, jVar3, hashMap, tVar));
                    d10.setTransactionSuccessful();
                    return aVar;
                } finally {
                    d10.endTransaction();
                }
            default:
                n7.k kVar = (n7.k) obj;
                o7.j jVar4 = (o7.j) kVar.f22502b;
                jVar4.getClass();
                Iterator it = ((Iterable) jVar4.j(new com.facebook.appevents.m(9))).iterator();
                while (it.hasNext()) {
                    ((n7.c) kVar.f22503c).a((i7.i) it.next(), 1, false);
                }
                return null;
        }
    }

    @Override // k8.y
    public int f(Object obj) {
        boolean z10;
        s7.r0 r0Var = (s7.r0) this.f1189c;
        k8.o oVar = (k8.o) obj;
        Pattern pattern = k8.z.a;
        oVar.getClass();
        String str = r0Var.f24723n;
        String str2 = oVar.f20329b;
        if (!str2.equals(str) && !str2.equals(k8.z.b(r0Var))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 || !oVar.c(r0Var, false)) {
            return 0;
        }
        return 1;
    }

    public void g(Display display) {
        o9.v vVar = (o9.v) this.f1189c;
        vVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            vVar.f23261k = refreshRate;
            vVar.f23262l = (refreshRate * 80) / 100;
        } else {
            n9.o.f("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            vVar.f23261k = C.TIME_UNSET;
            vVar.f23262l = C.TIME_UNSET;
        }
    }

    @Override // cc.a
    public void h(cc.c cVar) {
        gb.b bVar = (gb.b) this.f1189c;
        bVar.getClass();
        b6.a.f2288f.d("Crashlytics native component now available.", null);
        bVar.f18378b.set((gb.a) cVar.get());
    }

    @Override // n9.l
    public void invoke(Object obj) {
        int i10 = this.f1188b;
        Object obj2 = this.f1189c;
        switch (i10) {
            case 16:
                int i11 = s7.i0.f24392i0;
                ((f2) obj).i((s7.l1) obj2);
                return;
            case 17:
                ((f2) obj).i(((s7.f0) obj2).f24350b.M);
                return;
            case 18:
                ((f2) obj).J((l8.b) obj2);
                return;
            case 19:
                ((f2) obj).p((s7.q) obj2);
                return;
            case 20:
                ((f2) obj).g((a9.c) obj2);
                return;
            default:
                ((f2) obj).C((o9.z) obj2);
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        int i10 = this.f1188b;
        Object obj = this.f1189c;
        switch (i10) {
            case 0:
                ic.c0.a((Intent) obj);
                return;
            case 1:
                int i11 = ic.d0.f19537c;
                ((ic.e0) obj).f19539b.trySetResult(null);
                return;
            case 2:
                ((ScheduledFuture) obj).cancel(false);
                return;
            case 3:
                SplashActivity this$0 = (SplashActivity) obj;
                int i12 = SplashActivity.f16739n;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(task, "task");
                if (task.isSuccessful() && task.getResult() != null) {
                    Object result = task.getResult();
                    Intrinsics.checkNotNullExpressionValue(result, "getResult(...)");
                    String str = (String) result;
                    v8.u0.i0("KEY_SECRET_KEY", str, this$0.o());
                    Log.d("duylt", "Token: " + str);
                    return;
                }
                return;
            default:
                TasksKt.a((CompletableDeferred) obj, task);
                return;
        }
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public void onPaidEvent(AdValue adValue) {
        c3.j jVar = (c3.j) this.f1189c;
        d6.g.v(jVar.f2574j, adValue, jVar.f2575k.getAdUnitId(), jVar.f2575k.getResponseInfo().getMediationAdapterClassName());
        if (jVar.f2576l != null) {
            d6.g.w(adValue, jVar.f2575k.getAdUnitId(), jVar.f2576l);
        }
    }
}
