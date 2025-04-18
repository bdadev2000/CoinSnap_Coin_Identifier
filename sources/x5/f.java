package x5;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import com.facebook.internal.x;
import com.facebook.internal.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f27383b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f27384c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f27385d;

    /* renamed from: f, reason: collision with root package name */
    public final String f27386f;

    public f(View view, Handler handler, HashSet listenerSet, String activityName) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(listenerSet, "listenerSet");
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        this.f27383b = new WeakReference(view);
        this.f27385d = listenerSet;
        this.f27386f = activityName;
        handler.postDelayed(this, 200L);
    }

    public final void a(e eVar, View rootView, y5.c mapping) {
        boolean z10;
        HashSet hashSet;
        String str;
        a aVar;
        View hostView = eVar.a();
        if (hostView == null) {
            return;
        }
        View.OnClickListener e2 = y5.g.e(hostView);
        if (e2 instanceof a) {
            if (e2 != null) {
                if (((a) e2).f27367g) {
                    z10 = true;
                    hashSet = this.f27385d;
                    str = eVar.f27382b;
                    if (hashSet.contains(str) && !z10) {
                        if (!m6.a.b(c.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(mapping, "mapping");
                                Intrinsics.checkNotNullParameter(rootView, "rootView");
                                Intrinsics.checkNotNullParameter(hostView, "hostView");
                                aVar = new a(mapping, rootView, hostView);
                            } catch (Throwable th2) {
                                m6.a.a(c.class, th2);
                            }
                            hostView.setOnClickListener(aVar);
                            hashSet.add(str);
                            return;
                        }
                        aVar = null;
                        hostView.setOnClickListener(aVar);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnClickListener");
            }
        }
        z10 = false;
        hashSet = this.f27385d;
        str = eVar.f27382b;
        if (hashSet.contains(str)) {
        }
    }

    public final void b(e eVar, View rootView, y5.c mapping) {
        boolean z10;
        HashSet hashSet;
        String str;
        b bVar;
        AdapterView hostView = (AdapterView) eVar.a();
        if (hostView == null) {
            return;
        }
        AdapterView.OnItemClickListener onItemClickListener = hostView.getOnItemClickListener();
        if (onItemClickListener instanceof b) {
            if (onItemClickListener != null) {
                if (((b) onItemClickListener).f27372g) {
                    z10 = true;
                    hashSet = this.f27385d;
                    str = eVar.f27382b;
                    if (hashSet.contains(str) && !z10) {
                        if (!m6.a.b(c.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(mapping, "mapping");
                                Intrinsics.checkNotNullParameter(rootView, "rootView");
                                Intrinsics.checkNotNullParameter(hostView, "hostView");
                                bVar = new b(mapping, rootView, hostView);
                            } catch (Throwable th2) {
                                m6.a.a(c.class, th2);
                            }
                            hostView.setOnItemClickListener(bVar);
                            hashSet.add(str);
                            return;
                        }
                        bVar = null;
                        hostView.setOnItemClickListener(bVar);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.CodelessLoggingEventListener.AutoLoggingOnItemClickListener");
            }
        }
        z10 = false;
        hashSet = this.f27385d;
        str = eVar.f27382b;
        if (hashSet.contains(str)) {
        }
    }

    public final void c(e eVar, View rootView, y5.c mapping) {
        boolean z10;
        HashSet hashSet;
        String str;
        h hVar;
        View hostView = eVar.a();
        if (hostView == null) {
            return;
        }
        View.OnTouchListener f10 = y5.g.f(hostView);
        if (f10 instanceof h) {
            if (f10 != null) {
                if (((h) f10).f27397g) {
                    z10 = true;
                    hashSet = this.f27385d;
                    str = eVar.f27382b;
                    if (hashSet.contains(str) && !z10) {
                        if (!m6.a.b(i.class)) {
                            try {
                                Intrinsics.checkNotNullParameter(mapping, "mapping");
                                Intrinsics.checkNotNullParameter(rootView, "rootView");
                                Intrinsics.checkNotNullParameter(hostView, "hostView");
                                hVar = new h(mapping, rootView, hostView);
                            } catch (Throwable th2) {
                                m6.a.a(i.class, th2);
                            }
                            hostView.setOnTouchListener(hVar);
                            hashSet.add(str);
                            return;
                        }
                        hVar = null;
                        hostView.setOnTouchListener(hVar);
                        hashSet.add(str);
                        return;
                    }
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.appevents.codeless.RCTCodelessLoggingEventListener.AutoLoggingOnTouchListener");
            }
        }
        z10 = false;
        hashSet = this.f27385d;
        str = eVar.f27382b;
        if (hashSet.contains(str)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[Catch: all -> 0x00b7, TryCatch #2 {all -> 0x00b7, blocks: (B:35:0x008a, B:39:0x00aa, B:41:0x00b2, B:66:0x00a3, B:63:0x0093), top: B:34:0x008a, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x5.f.d():void");
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
        if (m6.a.b(this)) {
            return;
        }
        try {
            if (m6.a.b(this)) {
                return;
            }
            try {
                if (m6.a.b(this)) {
                    return;
                }
                try {
                    x b3 = z.b(com.facebook.x.b());
                    if (b3 != null && b3.f11127h) {
                        JSONArray jSONArray = b3.f11128i;
                        ArrayList arrayList = new ArrayList();
                        if (jSONArray != null) {
                            try {
                                int length = jSONArray.length();
                                if (length > 0) {
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = i10 + 1;
                                        JSONObject jSONObject = jSONArray.getJSONObject(i10);
                                        Intrinsics.checkNotNullExpressionValue(jSONObject, "array.getJSONObject(i)");
                                        arrayList.add(com.facebook.b.E(jSONObject));
                                        if (i11 >= length) {
                                            break;
                                        } else {
                                            i10 = i11;
                                        }
                                    }
                                }
                            } catch (IllegalArgumentException | JSONException unused) {
                            }
                        }
                        this.f27384c = arrayList;
                        View view = (View) this.f27383b.get();
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
                } catch (Throwable th2) {
                    m6.a.a(this, th2);
                }
            } catch (Throwable th3) {
                m6.a.a(this, th3);
            }
        } catch (Throwable th4) {
            m6.a.a(this, th4);
        }
    }
}
