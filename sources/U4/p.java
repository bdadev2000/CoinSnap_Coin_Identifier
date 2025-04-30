package U4;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.tools.arruler.photomeasure.camera.ruler.R;
import g4.C2296f;
import i3.C2342a;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import o4.C2496b;
import o4.C2502h;
import o4.InterfaceC2497c;
import q.C2624t;
import q.J0;
import q.O0;
import u4.C2756a;
import u4.C2764i;
import u4.C2773r;
import u4.C2777v;
import u4.C2778w;
import u4.C2781z;
import v4.C2850b;
import v4.C2852d;
import v4.C2853e;
import v4.InterfaceC2851c;
import w4.C2863B;
import w4.C2864C;
import w4.C2875e0;
import w4.C2881h0;
import w4.C2883i0;
import w4.D0;
import w4.L0;
import w4.P;
import w4.Q;
import w4.S;
import w4.T;
import x4.C2923a;
import z4.C2972a;

/* loaded from: classes2.dex */
public final class p implements InterfaceC2497c {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3317a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3318c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f3319d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f3320e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f3321f;

    public p(C2496b c2496b, InterfaceC2497c interfaceC2497c) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C2502h c2502h : c2496b.f21945c) {
            int i9 = c2502h.f21961c;
            boolean z8 = i9 == 0;
            int i10 = c2502h.b;
            o4.q qVar = c2502h.f21960a;
            if (z8) {
                if (i10 == 2) {
                    hashSet4.add(qVar);
                } else {
                    hashSet.add(qVar);
                }
            } else if (i9 == 2) {
                hashSet3.add(qVar);
            } else if (i10 == 2) {
                hashSet5.add(qVar);
            } else {
                hashSet2.add(qVar);
            }
        }
        if (!c2496b.f21949g.isEmpty()) {
            hashSet.add(o4.q.a(K4.b.class));
        }
        this.f3317a = Collections.unmodifiableSet(hashSet);
        this.b = Collections.unmodifiableSet(hashSet2);
        this.f3318c = Collections.unmodifiableSet(hashSet3);
        this.f3319d = Collections.unmodifiableSet(hashSet4);
        this.f3320e = Collections.unmodifiableSet(hashSet5);
        this.f3321f = interfaceC2497c;
    }

    public static Q h(Q q9, C2853e c2853e, z4.c cVar) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        P a6 = q9.a();
        String b = ((InterfaceC2851c) c2853e.b).b();
        if (b != null) {
            a6.f23772e = new C2875e0(b);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        C2852d c2852d = (C2852d) ((AtomicMarkableReference) ((H0.b) cVar.f24547d).f1345c).getReference();
        synchronized (c2852d) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(c2852d.f23612a));
        }
        List p2 = p(unmodifiableMap);
        C2852d c2852d2 = (C2852d) ((AtomicMarkableReference) ((H0.b) cVar.f24548e).f1345c).getReference();
        synchronized (c2852d2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(c2852d2.f23612a));
        }
        List p7 = p(unmodifiableMap2);
        if (!p2.isEmpty() || !p7.isEmpty()) {
            S s5 = (S) q9.f23777c;
            D0 d02 = s5.f23781a;
            if (d02 == null) {
                StringBuilder sb = new StringBuilder();
                if (d02 == null) {
                    sb.append(" execution");
                }
                throw new IllegalStateException(com.mbridge.msdk.foundation.entity.o.m(sb, "Missing required properties:"));
            }
            a6.f23770c = new S((T) d02, p2, p7, s5.f23783d, s5.f23784e, s5.f23785f, s5.f23786g);
        }
        return a6.a();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, w4.f0] */
    public static L0 i(Q q9, z4.c cVar) {
        List e4 = ((B3.g) cVar.f24549f).e();
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < e4.size(); i9++) {
            v4.m mVar = (v4.m) e4.get(i9);
            mVar.getClass();
            ?? obj = new Object();
            C2850b c2850b = (C2850b) mVar;
            String str = c2850b.f23610e;
            if (str != null) {
                String str2 = c2850b.b;
                if (str2 != null) {
                    obj.f23858a = new C2881h0(str2, str);
                    String str3 = c2850b.f23608c;
                    if (str3 != null) {
                        obj.b = str3;
                        String str4 = c2850b.f23609d;
                        if (str4 != null) {
                            obj.f23859c = str4;
                            obj.f23860d = c2850b.f23611f;
                            obj.f23861e = (byte) (obj.f23861e | 1);
                            arrayList.add(obj.a());
                        } else {
                            throw new NullPointerException("Null parameterValue");
                        }
                    } else {
                        throw new NullPointerException("Null parameterKey");
                    }
                } else {
                    throw new NullPointerException("Null rolloutId");
                }
            } else {
                throw new NullPointerException("Null variantId");
            }
        }
        if (arrayList.isEmpty()) {
            return q9;
        }
        P a6 = q9.a();
        a6.f23773f = new C2883i0(arrayList);
        return a6.a();
    }

    public static boolean j(int i9, int[] iArr) {
        for (int i10 : iArr) {
            if (i10 == i9) {
                return true;
            }
        }
        return false;
    }

    public static p k(Context context, C2778w c2778w, z4.c cVar, O5.d dVar, C2853e c2853e, z4.c cVar2, E1.d dVar2, B4.c cVar3, r4.c cVar4, C2764i c2764i) {
        C2773r c2773r = new C2773r(context, c2778w, dVar, dVar2, cVar3);
        C2972a c2972a = new C2972a(cVar, cVar3, c2764i);
        C2923a c2923a = A4.b.b;
        k3.s.b(context);
        return new p(c2773r, c2972a, new A4.b(new A4.f(k3.s.a().c(new C2342a(A4.b.f42c, A4.b.f43d)).a("FIREBASE_CRASHLYTICS_REPORT", new h3.c("json"), A4.b.f44e), cVar3.f(), cVar4)), c2853e, cVar2, c2778w);
    }

    public static ColorStateList l(Context context, int i9) {
        int c9 = O0.c(context, R.attr.colorControlHighlight);
        int b = O0.b(context, R.attr.colorButtonNormal);
        int[] iArr = O0.b;
        int[] iArr2 = O0.f22583d;
        int b8 = L.c.b(c9, i9);
        return new ColorStateList(new int[][]{iArr, iArr2, O0.f22582c, O0.f22585f}, new int[]{b, b8, L.c.b(c9, i9), i9});
    }

    public static LayerDrawable o(J0 j02, Context context, int i9) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i9);
        Drawable e4 = j02.e(context, R.drawable.abc_star_black_48dp);
        Drawable e9 = j02.e(context, R.drawable.abc_star_half_black_48dp);
        if ((e4 instanceof BitmapDrawable) && e4.getIntrinsicWidth() == dimensionPixelSize && e4.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) e4;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            e4.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e4.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((e9 instanceof BitmapDrawable) && e9.getIntrinsicWidth() == dimensionPixelSize && e9.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) e9;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            e9.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            e9.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static List p(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new w4.G(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new M2.b(5));
        return Collections.unmodifiableList(arrayList);
    }

    public static void t(Drawable drawable, int i9) {
        PorterDuffColorFilter g9;
        PorterDuff.Mode mode = C2624t.b;
        Drawable mutate = drawable.mutate();
        synchronized (C2624t.class) {
            g9 = J0.g(i9, mode);
        }
        mutate.setColorFilter(g9);
    }

    @Override // o4.InterfaceC2497c
    public Set a(o4.q qVar) {
        if (((Set) this.f3319d).contains(qVar)) {
            return ((InterfaceC2497c) this.f3321f).a(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Set<" + qVar + ">.");
    }

    @Override // o4.InterfaceC2497c
    public Object b(Class cls) {
        if (((Set) this.f3317a).contains(o4.q.a(cls))) {
            Object b = ((InterfaceC2497c) this.f3321f).b(cls);
            if (!cls.equals(K4.b.class)) {
                return b;
            }
            return new Object();
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // o4.InterfaceC2497c
    public N4.b c(Class cls) {
        return g(o4.q.a(cls));
    }

    @Override // o4.InterfaceC2497c
    public o4.o d(o4.q qVar) {
        if (((Set) this.f3318c).contains(qVar)) {
            return ((InterfaceC2497c) this.f3321f).d(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Deferred<" + qVar + ">.");
    }

    @Override // o4.InterfaceC2497c
    public N4.b e(o4.q qVar) {
        if (((Set) this.f3320e).contains(qVar)) {
            return ((InterfaceC2497c) this.f3321f).e(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<Set<" + qVar + ">>.");
    }

    @Override // o4.InterfaceC2497c
    public Object f(o4.q qVar) {
        if (((Set) this.f3317a).contains(qVar)) {
            return ((InterfaceC2497c) this.f3321f).f(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency " + qVar + ".");
    }

    @Override // o4.InterfaceC2497c
    public N4.b g(o4.q qVar) {
        if (((Set) this.b).contains(qVar)) {
            return ((InterfaceC2497c) this.f3321f).g(qVar);
        }
        throw new RuntimeException("Attempting to request an undeclared dependency Provider<" + qVar + ">.");
    }

    public Task m(Task task) {
        return task.continueWith(new A0.c(0), new F2.d(this, 5));
    }

    public o4.o n(Class cls) {
        return d(o4.q.a(cls));
    }

    public ColorStateList q(Context context, int i9) {
        if (i9 == R.drawable.abc_edit_text_material) {
            return I.h.getColorStateList(context, R.color.abc_tint_edittext);
        }
        if (i9 == 2131230894) {
            return I.h.getColorStateList(context, R.color.abc_tint_switch_track);
        }
        if (i9 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList d2 = O0.d(context, R.attr.colorSwitchThumbNormal);
            if (d2 != null && d2.isStateful()) {
                int[] iArr3 = O0.b;
                iArr[0] = iArr3;
                iArr2[0] = d2.getColorForState(iArr3, 0);
                iArr[1] = O0.f22584e;
                iArr2[1] = O0.c(context, R.attr.colorControlActivated);
                iArr[2] = O0.f22585f;
                iArr2[2] = d2.getDefaultColor();
            } else {
                iArr[0] = O0.b;
                iArr2[0] = O0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = O0.f22584e;
                iArr2[1] = O0.c(context, R.attr.colorControlActivated);
                iArr[2] = O0.f22585f;
                iArr2[2] = O0.c(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i9 == R.drawable.abc_btn_default_mtrl_shape) {
            return l(context, O0.c(context, R.attr.colorButtonNormal));
        }
        if (i9 == R.drawable.abc_btn_borderless_material) {
            return l(context, 0);
        }
        if (i9 == R.drawable.abc_btn_colored_material) {
            return l(context, O0.c(context, R.attr.colorAccent));
        }
        if (i9 != 2131230889 && i9 != R.drawable.abc_spinner_textfield_background_material) {
            if (j(i9, (int[]) this.b)) {
                return O0.d(context, R.attr.colorControlNormal);
            }
            if (j(i9, (int[]) this.f3320e)) {
                return I.h.getColorStateList(context, R.color.abc_tint_default);
            }
            if (j(i9, (int[]) this.f3321f)) {
                return I.h.getColorStateList(context, R.color.abc_tint_btn_checkable);
            }
            if (i9 == R.drawable.abc_seekbar_thumb_material) {
                return I.h.getColorStateList(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        return I.h.getColorStateList(context, R.color.abc_tint_spinner);
    }

    public Task r(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList b = ((C2972a) this.b).b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C2923a c2923a = C2972a.f24538g;
                String e4 = C2972a.e(file);
                c2923a.getClass();
                arrayList.add(new C2756a(C2923a.i(e4), file.getName(), file));
            } catch (IOException e9) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e9);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C2756a c2756a = (C2756a) it2.next();
            if (str == null || str.equals(c2756a.b)) {
                A4.b bVar = (A4.b) this.f3318c;
                C2864C c2864c = (C2864C) c2756a.f23109a;
                boolean z8 = true;
                if (c2864c.f23699f == null || c2864c.f23700g == null) {
                    C2777v b8 = ((C2778w) this.f3321f).b(true);
                    C2863B a6 = c2756a.f23109a.a();
                    a6.f23689e = b8.f23177a;
                    C2863B a9 = a6.a().a();
                    a9.f23690f = b8.b;
                    c2756a = new C2756a(a9.a(), c2756a.b, c2756a.f23110c);
                }
                if (str == null) {
                    z8 = false;
                }
                A4.f fVar = bVar.f45a;
                synchronized (fVar.f58f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z8) {
                            ((AtomicInteger) fVar.f61i.f22840c).getAndIncrement();
                            if (fVar.f58f.size() < fVar.f57e) {
                                r4.d dVar = r4.d.f22842a;
                                dVar.c("Enqueueing report: " + c2756a.b);
                                dVar.c("Queue size: " + fVar.f58f.size());
                                fVar.f59g.execute(new A4.e(fVar, c2756a, taskCompletionSource, 0));
                                dVar.c("Closing task for report: " + c2756a.b);
                                taskCompletionSource.trySetResult(c2756a);
                            } else {
                                fVar.a();
                                String str2 = "Dropping report due to queue being full: " + c2756a.b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str2, null);
                                }
                                ((AtomicInteger) fVar.f61i.f22841d).getAndIncrement();
                                taskCompletionSource.trySetResult(c2756a);
                            }
                        } else {
                            fVar.b(c2756a, taskCompletionSource);
                        }
                    } finally {
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new C2781z(this, 0)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s(java.lang.String r6, java.lang.String r7, android.os.Bundle r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: U4.p.s(java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public Task u(String str, String str2, Bundle bundle) {
        try {
            s(str, str2, bundle);
            return ((Rpc) this.f3318c).send(bundle);
        } catch (InterruptedException | ExecutionException e4) {
            return Tasks.forException(e4);
        }
    }

    public p() {
        this.f3317a = new int[]{2131230904, 2131230902, 2131230828};
        this.b = new int[]{2131230852, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.f3318c = new int[]{2131230901, 2131230903, 2131230845, R.drawable.abc_text_cursor_material, 2131230898, 2131230899, 2131230900};
        this.f3319d = new int[]{2131230877, R.drawable.abc_cab_background_internal_bg, 2131230876};
        this.f3320e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f3321f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public p(C2773r c2773r, C2972a c2972a, A4.b bVar, C2853e c2853e, z4.c cVar, C2778w c2778w) {
        this.f3317a = c2773r;
        this.b = c2972a;
        this.f3318c = bVar;
        this.f3319d = c2853e;
        this.f3320e = cVar;
        this.f3321f = c2778w;
    }

    public p(C2296f c2296f, r rVar, N4.b bVar, N4.b bVar2, O4.e eVar) {
        c2296f.a();
        Rpc rpc = new Rpc(c2296f.f20433a);
        this.f3317a = c2296f;
        this.b = rVar;
        this.f3318c = rpc;
        this.f3319d = bVar;
        this.f3320e = bVar2;
        this.f3321f = eVar;
    }
}
