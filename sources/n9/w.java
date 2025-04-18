package n9;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static w f22592e;
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f22593b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f22594c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f22595d;

    public /* synthetic */ w(Object obj, Object obj2, Serializable serializable, int i10) {
        this.f22593b = obj;
        this.f22594c = obj2;
        this.f22595d = serializable;
        this.a = i10;
    }

    public static void a(int i10, w wVar) {
        synchronized (wVar.f22595d) {
            if (wVar.a != i10) {
                wVar.a = i10;
                Iterator it = ((CopyOnWriteArrayList) wVar.f22594c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    m9.r rVar = (m9.r) weakReference.get();
                    if (rVar != null) {
                        rVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) wVar.f22594c).remove(weakReference);
                    }
                }
            }
        }
    }

    public static synchronized w c(Context context) {
        w wVar;
        synchronized (w.class) {
            if (f22592e == null) {
                f22592e = new w(context);
            }
            wVar = f22592e;
        }
        return wVar;
    }

    public final String b(int i10, String str, long j3, long j10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.a;
            Object obj = this.f22593b;
            if (i11 < i12) {
                sb2.append(((String[]) obj)[i11]);
                Object obj2 = this.f22594c;
                if (((int[]) obj2)[i11] == 1) {
                    sb2.append(str);
                } else {
                    int i13 = ((int[]) obj2)[i11];
                    Object obj3 = this.f22595d;
                    if (i13 == 2) {
                        sb2.append(String.format(Locale.US, ((String[]) obj3)[i11], Long.valueOf(j3)));
                    } else if (((int[]) obj2)[i11] == 3) {
                        sb2.append(String.format(Locale.US, ((String[]) obj3)[i11], Integer.valueOf(i10)));
                    } else if (((int[]) obj2)[i11] == 4) {
                        sb2.append(String.format(Locale.US, ((String[]) obj3)[i11], Long.valueOf(j10)));
                    }
                }
                i11++;
            } else {
                sb2.append(((String[]) obj)[i12]);
                return sb2.toString();
            }
        }
    }

    public w(int i10, String str, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.a = i10;
        this.f22593b = str;
        if (arrayList == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f22594c = unmodifiableList;
        this.f22595d = bArr;
    }

    public w(Context context) {
        this.f22593b = new Handler(Looper.getMainLooper());
        this.f22594c = new CopyOnWriteArrayList();
        this.f22595d = new Object();
        this.a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new h.c0(this), intentFilter);
    }
}
