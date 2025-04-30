package z2;

import C2.m;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import com.facebook.internal.t;
import com.facebook.internal.w;
import com.facebook.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {
    public final WeakReference b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f24516c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f24517d;

    /* renamed from: f, reason: collision with root package name */
    public final String f24518f;

    public f(View view, Handler handler, HashSet hashSet, String str) {
        G7.j.e(handler, "handler");
        G7.j.e(hashSet, "listenerSet");
        this.b = new WeakReference(view);
        this.f24517d = hashSet;
        this.f24518f = str;
        handler.postDelayed(this, 200L);
    }

    public final void a(e eVar, View view, A2.c cVar) {
        boolean z8;
        HashSet hashSet;
        String str;
        View a6 = eVar.a();
        if (a6 == null) {
            return;
        }
        View.OnClickListener e4 = A2.g.e(a6);
        if (e4 instanceof ViewOnClickListenerC2969a) {
            if (e4 != null) {
                if (((ViewOnClickListenerC2969a) e4).f24502g) {
                    z8 = true;
                    hashSet = this.f24517d;
                    str = eVar.b;
                    if (hashSet.contains(str) && !z8) {
                        ViewOnClickListenerC2969a viewOnClickListenerC2969a = null;
                        if (!O2.a.b(c.class)) {
                            try {
                                viewOnClickListenerC2969a = new ViewOnClickListenerC2969a(cVar, view, a6);
                            } catch (Throwable th) {
                                O2.a.a(c.class, th);
                            }
                        }
                        a6.setOnClickListener(viewOnClickListenerC2969a);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
            }
        }
        z8 = false;
        hashSet = this.f24517d;
        str = eVar.b;
        if (hashSet.contains(str)) {
        }
    }

    public final void b(e eVar, View view, A2.c cVar) {
        boolean z8;
        HashSet hashSet;
        String str;
        AdapterView adapterView = (AdapterView) eVar.a();
        if (adapterView == null) {
            return;
        }
        AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
        if (onItemClickListener instanceof C2970b) {
            if (onItemClickListener != null) {
                if (((C2970b) onItemClickListener).f24506g) {
                    z8 = true;
                    hashSet = this.f24517d;
                    str = eVar.b;
                    if (hashSet.contains(str) && !z8) {
                        C2970b c2970b = null;
                        if (!O2.a.b(c.class)) {
                            try {
                                c2970b = new C2970b(cVar, view, adapterView);
                            } catch (Throwable th) {
                                O2.a.a(c.class, th);
                            }
                        }
                        adapterView.setOnItemClickListener(c2970b);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
            }
        }
        z8 = false;
        hashSet = this.f24517d;
        str = eVar.b;
        if (hashSet.contains(str)) {
        }
    }

    public final void c(e eVar, View view, A2.c cVar) {
        boolean z8;
        HashSet hashSet;
        String str;
        View a6 = eVar.a();
        if (a6 == null) {
            return;
        }
        View.OnTouchListener f9 = A2.g.f(a6);
        if (f9 instanceof h) {
            if (f9 != null) {
                if (((h) f9).f24528g) {
                    z8 = true;
                    hashSet = this.f24517d;
                    str = eVar.b;
                    if (hashSet.contains(str) && !z8) {
                        h hVar = null;
                        if (!O2.a.b(i.class)) {
                            try {
                                hVar = new h(cVar, view, a6);
                            } catch (Throwable th) {
                                O2.a.a(i.class, th);
                            }
                        }
                        a6.setOnTouchListener(hVar);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
            }
        }
        z8 = false;
        hashSet = this.f24517d;
        str = eVar.b;
        if (hashSet.contains(str)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00a9 A[Catch: all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:53:0x0087, B:57:0x00a9, B:59:0x00b1, B:68:0x00a1, B:65:0x0091), top: B:52:0x0087, outer: #2, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.f.d():void");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        d();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        d();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (O2.a.b(this)) {
            return;
        }
        try {
            if (O2.a.b(this)) {
                return;
            }
            try {
                if (O2.a.b(this)) {
                    return;
                }
                try {
                    t b = w.b(r.b());
                    if (b != null && b.f13663g) {
                        JSONArray jSONArray = b.f13664h;
                        ArrayList arrayList = new ArrayList();
                        if (jSONArray != null) {
                            try {
                                int length = jSONArray.length();
                                if (length > 0) {
                                    int i9 = 0;
                                    while (true) {
                                        int i10 = i9 + 1;
                                        JSONObject jSONObject = jSONArray.getJSONObject(i9);
                                        G7.j.d(jSONObject, "array.getJSONObject(i)");
                                        arrayList.add(m.r(jSONObject));
                                        if (i10 >= length) {
                                            break;
                                        } else {
                                            i9 = i10;
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException | JSONException unused) {
                            }
                        }
                        this.f24516c = arrayList;
                        View view = (View) this.b.get();
                        if (view == null) {
                            return;
                        }
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        d();
                    }
                } catch (Throwable th) {
                    O2.a.a(this, th);
                }
            } catch (Throwable th2) {
                O2.a.a(this, th2);
            }
        } catch (Throwable th3) {
            O2.a.a(this, th3);
        }
    }
}
