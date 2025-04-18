package a4;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.play_billing.zzai;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import wh.o0;
import wh.s0;
import wh.t0;

/* loaded from: classes.dex */
public final class f {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f110b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f111c;

    /* renamed from: d, reason: collision with root package name */
    public Object f112d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f113e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f114f;

    public f() {
        h hVar = new h();
        hVar.f134c = true;
        this.f114f = hVar;
    }

    public static f c(SharedPreferences sharedPreferences, Executor executor) {
        f fVar = new f(sharedPreferences, executor);
        synchronized (((ArrayDeque) fVar.f113e)) {
            ((ArrayDeque) fVar.f113e).clear();
            String string = ((SharedPreferences) fVar.f112d).getString((String) fVar.a, "");
            if (!TextUtils.isEmpty(string) && string.contains((String) fVar.f110b)) {
                String[] split = string.split((String) fVar.f110b, -1);
                if (split.length == 0) {
                    Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                }
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        ((ArrayDeque) fVar.f113e).add(str);
                    }
                }
            }
        }
        return fVar;
    }

    public final IOException a(boolean z10, boolean z11, IOException ioe) {
        if (ioe != null) {
            h(ioe);
        }
        Object obj = this.f110b;
        Object obj2 = this.a;
        if (z11) {
            if (ioe != null) {
                bi.i call = (bi.i) obj2;
                ((y5.f) obj).getClass();
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                bi.i call2 = (bi.i) obj2;
                ((y5.f) obj).getClass();
                Intrinsics.checkNotNullParameter(call2, "call");
            }
        }
        if (z10) {
            if (ioe != null) {
                bi.i call3 = (bi.i) obj2;
                ((y5.f) obj).getClass();
                Intrinsics.checkNotNullParameter(call3, "call");
                Intrinsics.checkNotNullParameter(ioe, "ioe");
            } else {
                bi.i call4 = (bi.i) obj2;
                ((y5.f) obj).getClass();
                Intrinsics.checkNotNullParameter(call4, "call");
            }
        }
        return ((bi.i) obj2).h(this, z11, z10, ioe);
    }

    public final i b() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        zzai zzk;
        ArrayList arrayList2 = (ArrayList) this.f113e;
        boolean z13 = false;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        List list = (List) this.f112d;
        if (list != null && !list.isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            throw new IllegalArgumentException("Details of the products must be provided.");
        }
        if (z10 && z11) {
            throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
        }
        if (z10) {
            if (!arrayList2.contains(null)) {
                if (arrayList2.size() > 1) {
                    j.t(arrayList2.get(0));
                    throw null;
                }
            } else {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
        } else {
            g gVar = (g) ((List) this.f112d).get(0);
            for (int i10 = 0; i10 < ((List) this.f112d).size(); i10++) {
                g gVar2 = (g) ((List) this.f112d).get(i10);
                if (gVar2 != null) {
                    if (i10 != 0) {
                        u uVar = gVar2.a;
                        if (!uVar.f163d.equals(gVar.a.f163d) && !uVar.f163d.equals("play_pass_subs")) {
                            throw new IllegalArgumentException("All products should have same ProductType.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                }
            }
            String optString = gVar.a.f161b.optString("packageName");
            for (g gVar3 : (List) this.f112d) {
                if (!gVar.a.f163d.equals("play_pass_subs") && !gVar3.a.f163d.equals("play_pass_subs") && !optString.equals(gVar3.a.f161b.optString("packageName"))) {
                    throw new IllegalArgumentException("All products must have the same package name.");
                }
            }
        }
        i iVar = new i();
        if (!z10) {
            if (z11 && !((g) ((List) this.f112d).get(0)).a.f161b.optString("packageName").isEmpty()) {
                z12 = true;
            } else {
                z12 = false;
            }
            iVar.a = z12;
            iVar.f137b = (String) this.a;
            iVar.f138c = (String) this.f110b;
            h hVar = (h) this.f114f;
            String str = (String) hVar.f135d;
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(null)) {
                z13 = true;
            }
            String str2 = (String) hVar.f136e;
            boolean isEmpty = true ^ TextUtils.isEmpty(str2);
            if (z13 && isEmpty) {
                throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
            }
            if (!hVar.f134c && !z13 && !isEmpty) {
                throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
            }
            f0.c cVar = new f0.c();
            cVar.f17516c = str;
            cVar.f17515b = hVar.f133b;
            cVar.f17517d = str2;
            iVar.f139d = cVar;
            if (arrayList2 != null) {
                arrayList = new ArrayList(arrayList2);
            } else {
                arrayList = new ArrayList();
            }
            iVar.f141f = arrayList;
            iVar.f142g = this.f111c;
            List list2 = (List) this.f112d;
            if (list2 != null) {
                zzk = zzai.zzj(list2);
            } else {
                zzk = zzai.zzk();
            }
            iVar.f140e = zzk;
            return iVar;
        }
        j.t(arrayList2.get(0));
        throw null;
    }

    public final bi.c d(o0 request, boolean z10) {
        Intrinsics.checkNotNullParameter(request, "request");
        this.f111c = z10;
        s0 s0Var = request.f27153d;
        Intrinsics.checkNotNull(s0Var);
        long contentLength = s0Var.contentLength();
        y5.f fVar = (y5.f) this.f110b;
        bi.i call = (bi.i) this.a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
        return new bi.c(this, ((ci.d) this.f113e).e(request, contentLength), contentLength);
    }

    public final t0 e(boolean z10) {
        try {
            t0 readResponseHeaders = ((ci.d) this.f113e).readResponseHeaders(z10);
            if (readResponseHeaders != null) {
                Intrinsics.checkNotNullParameter(this, "deferredTrailers");
                readResponseHeaders.f27211m = this;
            }
            return readResponseHeaders;
        } catch (IOException ioe) {
            y5.f fVar = (y5.f) this.f110b;
            bi.i call = (bi.i) this.a;
            fVar.getClass();
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(ioe, "ioe");
            h(ioe);
            throw ioe;
        }
    }

    public final boolean f(String str) {
        boolean remove;
        synchronized (((ArrayDeque) this.f113e)) {
            remove = ((ArrayDeque) this.f113e).remove(str);
            if (remove && !this.f111c) {
                ((Executor) this.f114f).execute(new k8.f(this, 11));
            }
        }
        return remove;
    }

    public final void g() {
        y5.f fVar = (y5.f) this.f110b;
        bi.i call = (bi.i) this.a;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(call, "call");
    }

    public final void h(IOException iOException) {
        boolean z10;
        ((bi.e) this.f112d).c(iOException);
        bi.k d10 = ((ci.d) this.f113e).d();
        bi.i call = (bi.i) this.a;
        synchronized (d10) {
            Intrinsics.checkNotNullParameter(call, "call");
            if (iOException instanceof ei.f0) {
                if (((ei.f0) iOException).f17417b == ei.b.REFUSED_STREAM) {
                    int i10 = d10.f2497n + 1;
                    d10.f2497n = i10;
                    if (i10 > 1) {
                        d10.f2493j = true;
                        d10.f2495l++;
                    }
                } else if (((ei.f0) iOException).f17417b != ei.b.CANCEL || !call.f2482r) {
                    d10.f2493j = true;
                    d10.f2495l++;
                }
            } else {
                if (d10.f2490g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || (iOException instanceof ei.a)) {
                    d10.f2493j = true;
                    if (d10.f2496m == 0) {
                        bi.k.d(call.f2467b, d10.f2485b, iOException);
                        d10.f2495l++;
                    }
                }
            }
        }
    }

    public f(bi.i call, y5.f eventListener, bi.e finder, ci.d codec) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(codec, "codec");
        this.a = call;
        this.f110b = eventListener;
        this.f112d = finder;
        this.f113e = codec;
        this.f114f = codec.d();
    }

    public f(SharedPreferences sharedPreferences, Executor executor) {
        this.f113e = new ArrayDeque();
        this.f111c = false;
        this.f112d = sharedPreferences;
        this.a = "topic_operation_queue";
        this.f110b = ",";
        this.f114f = executor;
    }
}
