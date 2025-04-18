package a5;

import android.os.Handler;
import android.text.TextUtils;
import androidx.core.app.p0;
import com.bytedance.sdk.component.Sg.YFl.EH;
import com.bytedance.sdk.component.Sg.YFl.GA;
import com.mbridge.msdk.foundation.download.Command;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class n implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicLong f215m = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public volatile va.b f216b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f217c = new AtomicInteger();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f218d = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public volatile List f219f;

    /* renamed from: g, reason: collision with root package name */
    public volatile String f220g;

    /* renamed from: h, reason: collision with root package name */
    public volatile String f221h;

    /* renamed from: i, reason: collision with root package name */
    public volatile h.c f222i;

    /* renamed from: j, reason: collision with root package name */
    public volatile p f223j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f224k;

    /* renamed from: l, reason: collision with root package name */
    public int f225l;

    public n(va.b bVar, b5.b bVar2) {
        f215m.incrementAndGet();
        this.f224k = new AtomicInteger(0);
        this.f225l = -1;
        this.f216b = bVar;
    }

    public final boolean a() {
        return g() == 1;
    }

    public final boolean b() {
        return this.f224k.get() == 1;
    }

    public final h.c c(o oVar, int i10, int i11, String str) {
        String str2;
        String concat;
        boolean z10;
        e5.a aVar = new e5.a();
        e5.b bVar = new e5.b();
        HashMap hashMap = new HashMap();
        bVar.a = oVar.a;
        "HEAD".equalsIgnoreCase(str);
        List<i> list = this.f219f;
        if (list != null && !list.isEmpty()) {
            for (i iVar : list) {
                if (!Command.HTTP_HEADER_RANGE.equalsIgnoreCase(iVar.a) && !"Connection".equalsIgnoreCase(iVar.a) && !"Proxy-Connection".equalsIgnoreCase(iVar.a) && !"Host".equalsIgnoreCase(iVar.a)) {
                    hashMap.put(iVar.a, iVar.f197b);
                }
            }
        }
        Handler handler = i5.a.a;
        if (i10 >= 0 && i11 > 0) {
            str2 = i10 + "-" + i11;
        } else if (i10 > 0) {
            str2 = i10 + "-";
        } else if (i10 < 0 && i11 > 0) {
            str2 = "-".concat(String.valueOf(i11));
        } else {
            str2 = null;
        }
        if (str2 == null) {
            concat = null;
        } else {
            concat = "bytes=".concat(str2);
        }
        if (concat != null) {
            hashMap.put(Command.HTTP_HEADER_RANGE, concat);
        }
        boolean z11 = v.a;
        e c10 = e.c();
        t b3 = t.b();
        if (this.f222i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            c10.getClass();
        } else {
            b3.getClass();
        }
        if (z10) {
            c10.getClass();
        } else {
            b3.getClass();
        }
        bVar.f17110b = hashMap;
        GA.YFl yFl = new GA.YFl();
        try {
            HashMap hashMap2 = bVar.f17110b;
            if (hashMap2 != null) {
                for (Map.Entry entry : hashMap2.entrySet()) {
                    String str3 = (String) entry.getKey();
                    if (!TextUtils.isEmpty(str3)) {
                        String str4 = (String) entry.getValue();
                        if (str4 == null) {
                            str4 = "";
                        }
                        yFl.Sg(str3, str4);
                    }
                }
            }
            EH Sg = aVar.a.YFl(yFl.Sg(bVar.a).YFl().YFl("videoPreloadLowVersion").YFl(6).Sg()).Sg();
            Sg.tN();
            return new h.c(Sg, bVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void d() {
        this.f224k.compareAndSet(0, 1);
    }

    public final void e(int i10, int i11) {
        if (i10 > 0 && i11 >= 0) {
            int i12 = v.f242c;
            int g10 = g();
            if (i12 == 1 || (i12 == 2 && g10 == 1)) {
                int i13 = (int) ((i11 / i10) * 100.0f);
                if (i13 > 100) {
                    i13 = 100;
                }
                synchronized (this) {
                    if (i13 <= this.f225l) {
                        return;
                    }
                    this.f225l = i13;
                    androidx.activity.i iVar = new androidx.activity.i(this, 15);
                    if (i5.a.a()) {
                        iVar.run();
                    } else {
                        i5.a.a.post(iVar);
                    }
                }
            }
        }
    }

    public final void f() {
        this.f224k.compareAndSet(0, 2);
    }

    public final int g() {
        if (this.f222i != null) {
            return ((p0) this.f222i.f18525f).f1218b;
        }
        return 0;
    }

    public final void h() {
        if (!b()) {
        } else {
            throw new d5.c();
        }
    }
}
