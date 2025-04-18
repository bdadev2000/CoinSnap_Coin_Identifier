package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.v4.media.d;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.compose.foundation.text.input.a;
import androidx.constraintlayout.motion.utils.StopLogic;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayoutStates;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class MotionLayout extends ConstraintLayout implements NestedScrollingParent3 {
    public static final /* synthetic */ int P = 0;
    public boolean A;
    public ArrayList B;
    public ArrayList C;
    public ArrayList D;
    public int E;
    public long F;
    public float G;
    public int H;
    public float I;
    public float J;
    public boolean K;
    public StateCache L;
    public TransitionState M;
    public boolean N;
    public View O;

    /* renamed from: a, reason: collision with root package name */
    public MotionScene f17818a;

    /* renamed from: b, reason: collision with root package name */
    public Interpolator f17819b;

    /* renamed from: c, reason: collision with root package name */
    public float f17820c;
    public int d;

    /* renamed from: f, reason: collision with root package name */
    public int f17821f;

    /* renamed from: g, reason: collision with root package name */
    public int f17822g;

    /* renamed from: h, reason: collision with root package name */
    public int f17823h;

    /* renamed from: i, reason: collision with root package name */
    public int f17824i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17825j;

    /* renamed from: k, reason: collision with root package name */
    public long f17826k;

    /* renamed from: l, reason: collision with root package name */
    public float f17827l;

    /* renamed from: m, reason: collision with root package name */
    public float f17828m;

    /* renamed from: n, reason: collision with root package name */
    public float f17829n;

    /* renamed from: o, reason: collision with root package name */
    public long f17830o;

    /* renamed from: p, reason: collision with root package name */
    public float f17831p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f17832q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f17833r;

    /* renamed from: s, reason: collision with root package name */
    public TransitionListener f17834s;

    /* renamed from: t, reason: collision with root package name */
    public int f17835t;

    /* renamed from: u, reason: collision with root package name */
    public DevModeDraw f17836u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f17837v;
    public DesignTool w;
    public int x;

    /* renamed from: y, reason: collision with root package name */
    public int f17838y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17839z;

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.MotionLayout$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17840a;

        static {
            int[] iArr = new int[TransitionState.values().length];
            f17840a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17840a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17840a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17840a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class DecelerateInterpolator extends MotionInterpolator {
        @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
        public final float a() {
            throw null;
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f2) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public class DevModeDraw {
        public DevModeDraw(MotionLayout motionLayout) {
            new Rect();
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(-21965);
            paint.setStrokeWidth(2.0f);
            Paint.Style style = Paint.Style.STROKE;
            paint.setStyle(style);
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            paint2.setColor(-2067046);
            paint2.setStrokeWidth(2.0f);
            paint2.setStyle(style);
            Paint paint3 = new Paint();
            paint3.setAntiAlias(true);
            paint3.setColor(-13391360);
            paint3.setStrokeWidth(2.0f);
            paint3.setStyle(style);
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            paint4.setColor(-13391360);
            paint4.setTextSize(motionLayout.getContext().getResources().getDisplayMetrics().density * 12.0f);
            new Paint().setAntiAlias(true);
            paint3.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
        }
    }

    /* loaded from: classes2.dex */
    public class Model {
    }

    /* loaded from: classes2.dex */
    public interface MotionTracker {
    }

    /* loaded from: classes2.dex */
    public static class MyTracker implements MotionTracker {

        /* renamed from: b, reason: collision with root package name */
        public static final MyTracker f17841b = new Object();

        /* renamed from: a, reason: collision with root package name */
        public VelocityTracker f17842a;

        public final void a() {
            this.f17842a.recycle();
            this.f17842a = null;
        }
    }

    /* loaded from: classes2.dex */
    public class StateCache {

        /* renamed from: a, reason: collision with root package name */
        public float f17843a = Float.NaN;

        /* renamed from: b, reason: collision with root package name */
        public float f17844b = Float.NaN;

        /* renamed from: c, reason: collision with root package name */
        public int f17845c = -1;
        public int d = -1;

        public StateCache() {
        }

        public final void a() {
            int i2 = this.f17845c;
            MotionLayout motionLayout = MotionLayout.this;
            if (i2 != -1 || this.d != -1) {
                if (i2 == -1) {
                    motionLayout.h(this.d);
                } else {
                    int i3 = this.d;
                    if (i3 == -1) {
                        motionLayout.setState(i2, -1, -1);
                    } else {
                        motionLayout.g(i2, i3);
                    }
                }
                motionLayout.setState(TransitionState.f17846a);
            }
            if (Float.isNaN(this.f17844b)) {
                if (Float.isNaN(this.f17843a)) {
                    return;
                }
                motionLayout.setProgress(this.f17843a);
                return;
            }
            float f2 = this.f17843a;
            float f3 = this.f17844b;
            if (motionLayout.isAttachedToWindow()) {
                motionLayout.setProgress(f2);
                motionLayout.setState(TransitionState.f17847b);
                motionLayout.f17820c = f3;
                motionLayout.b(1.0f);
            } else {
                if (motionLayout.L == null) {
                    motionLayout.L = new StateCache();
                }
                StateCache stateCache = motionLayout.L;
                stateCache.f17843a = f2;
                stateCache.f17844b = f3;
            }
            this.f17843a = Float.NaN;
            this.f17844b = Float.NaN;
            this.f17845c = -1;
            this.d = -1;
        }
    }

    /* loaded from: classes2.dex */
    public interface TransitionListener {
        void a();

        void b();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public static final class TransitionState {

        /* renamed from: a, reason: collision with root package name */
        public static final TransitionState f17846a;

        /* renamed from: b, reason: collision with root package name */
        public static final TransitionState f17847b;

        /* renamed from: c, reason: collision with root package name */
        public static final TransitionState f17848c;
        public static final /* synthetic */ TransitionState[] d;

        /* JADX INFO: Fake field, exist only in values array */
        TransitionState EF0;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.constraintlayout.motion.widget.MotionLayout$TransitionState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.constraintlayout.motion.widget.MotionLayout$TransitionState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [androidx.constraintlayout.motion.widget.MotionLayout$TransitionState, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [androidx.constraintlayout.motion.widget.MotionLayout$TransitionState, java.lang.Enum] */
        static {
            ?? r02 = new Enum("UNDEFINED", 0);
            ?? r1 = new Enum("SETUP", 1);
            f17846a = r1;
            ?? r2 = new Enum("MOVING", 2);
            f17847b = r2;
            ?? r3 = new Enum("FINISHED", 3);
            f17848c = r3;
            d = new TransitionState[]{r02, r1, r2, r3};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) d.clone();
        }
    }

    public final void b(float f2) {
        MotionScene motionScene = this.f17818a;
        if (motionScene == null) {
            return;
        }
        float f3 = this.f17829n;
        float f4 = this.f17828m;
        if (f3 != f4 && this.f17832q) {
            this.f17829n = f4;
        }
        float f5 = this.f17829n;
        if (f5 == f2) {
            return;
        }
        this.f17837v = false;
        this.f17831p = f2;
        this.f17827l = (motionScene.f17851c != null ? r3.f17870h : motionScene.f17856j) / 1000.0f;
        setProgress(f2);
        this.f17819b = this.f17818a.d();
        this.f17832q = false;
        this.f17826k = getNanoTime();
        this.f17833r = true;
        this.f17828m = f5;
        this.f17829n = f5;
        invalidate();
    }

    public final void c(boolean z2) {
        float f2;
        boolean z3;
        int i2;
        float interpolation;
        boolean z4;
        if (this.f17830o == -1) {
            this.f17830o = getNanoTime();
        }
        float f3 = this.f17829n;
        if (f3 > 0.0f && f3 < 1.0f) {
            this.f17821f = -1;
        }
        boolean z5 = false;
        if (this.A || (this.f17833r && (z2 || this.f17831p != f3))) {
            float signum = Math.signum(this.f17831p - f3);
            long nanoTime = getNanoTime();
            Interpolator interpolator = this.f17819b;
            if (interpolator instanceof MotionInterpolator) {
                f2 = 0.0f;
            } else {
                f2 = ((((float) (nanoTime - this.f17830o)) * signum) * 1.0E-9f) / this.f17827l;
                this.f17820c = f2;
            }
            float f4 = this.f17829n + f2;
            if (this.f17832q) {
                f4 = this.f17831p;
            }
            if ((signum <= 0.0f || f4 < this.f17831p) && (signum > 0.0f || f4 > this.f17831p)) {
                z3 = false;
            } else {
                f4 = this.f17831p;
                this.f17833r = false;
                z3 = true;
            }
            this.f17829n = f4;
            this.f17828m = f4;
            this.f17830o = nanoTime;
            if (interpolator != null && !z3) {
                if (this.f17837v) {
                    interpolation = interpolator.getInterpolation(((float) (nanoTime - this.f17826k)) * 1.0E-9f);
                    this.f17829n = interpolation;
                    this.f17830o = nanoTime;
                    Interpolator interpolator2 = this.f17819b;
                    if (interpolator2 instanceof MotionInterpolator) {
                        float a2 = ((MotionInterpolator) interpolator2).a();
                        this.f17820c = a2;
                        if (Math.abs(a2) * this.f17827l <= 1.0E-5f) {
                            this.f17833r = false;
                        }
                        if (a2 > 0.0f && interpolation >= 1.0f) {
                            this.f17829n = 1.0f;
                            this.f17833r = false;
                            interpolation = 1.0f;
                        }
                        if (a2 < 0.0f && interpolation <= 0.0f) {
                            this.f17829n = 0.0f;
                            this.f17833r = false;
                            f4 = 0.0f;
                        }
                    }
                } else {
                    interpolation = interpolator.getInterpolation(f4);
                    Interpolator interpolator3 = this.f17819b;
                    if (interpolator3 instanceof MotionInterpolator) {
                        this.f17820c = ((MotionInterpolator) interpolator3).a();
                    } else {
                        this.f17820c = ((interpolator3.getInterpolation(f4 + f2) - interpolation) * signum) / f2;
                    }
                }
                f4 = interpolation;
            }
            if (Math.abs(this.f17820c) > 1.0E-5f) {
                setState(TransitionState.f17847b);
            }
            if ((signum > 0.0f && f4 >= this.f17831p) || (signum <= 0.0f && f4 <= this.f17831p)) {
                f4 = this.f17831p;
                this.f17833r = false;
            }
            TransitionState transitionState = TransitionState.f17848c;
            if (f4 >= 1.0f || f4 <= 0.0f) {
                this.f17833r = false;
                setState(transitionState);
            }
            int childCount = getChildCount();
            this.A = false;
            getNanoTime();
            this.J = f4;
            if (childCount > 0) {
                getChildAt(0);
                throw null;
            }
            boolean z6 = (signum > 0.0f && f4 >= this.f17831p) || (signum <= 0.0f && f4 <= this.f17831p);
            if (!this.A && !this.f17833r && z6) {
                setState(transitionState);
            }
            this.A = (!z6) | this.A;
            if (f4 <= 0.0f && (i2 = this.d) != -1 && this.f17821f != i2) {
                this.f17821f = i2;
                this.f17818a.b(i2).a(this);
                setState(transitionState);
                z5 = true;
            }
            if (f4 >= 1.0d) {
                int i3 = this.f17821f;
                int i4 = this.f17822g;
                if (i3 != i4) {
                    this.f17821f = i4;
                    this.f17818a.b(i4).a(this);
                    setState(transitionState);
                    z5 = true;
                }
            }
            if (this.A || this.f17833r) {
                invalidate();
            } else if ((signum > 0.0f && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                setState(transitionState);
            }
            if ((!this.A && this.f17833r && signum > 0.0f && f4 == 1.0f) || (signum < 0.0f && f4 == 0.0f)) {
                f();
            }
        }
        float f5 = this.f17829n;
        if (f5 < 1.0f) {
            if (f5 <= 0.0f) {
                int i5 = this.f17821f;
                int i6 = this.d;
                z4 = i5 == i6 ? z5 : true;
                this.f17821f = i6;
            }
            this.N |= z5;
            if (z5 && !this.K) {
                requestLayout();
            }
            this.f17828m = this.f17829n;
        }
        int i7 = this.f17821f;
        int i8 = this.f17822g;
        z4 = i7 == i8 ? z5 : true;
        this.f17821f = i8;
        z5 = z4;
        this.N |= z5;
        if (z5) {
            requestLayout();
        }
        this.f17828m = this.f17829n;
    }

    public final void d() {
        ArrayList arrayList;
        if ((this.f17834s == null && ((arrayList = this.D) == null || arrayList.isEmpty())) || this.I == this.f17828m) {
            return;
        }
        if (this.H != -1) {
            TransitionListener transitionListener = this.f17834s;
            if (transitionListener != null) {
                transitionListener.b();
            }
            ArrayList arrayList2 = this.D;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((TransitionListener) it.next()).b();
                }
            }
        }
        this.H = -1;
        this.I = this.f17828m;
        TransitionListener transitionListener2 = this.f17834s;
        if (transitionListener2 != null) {
            transitionListener2.a();
        }
        ArrayList arrayList3 = this.D;
        if (arrayList3 != null) {
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                ((TransitionListener) it2.next()).a();
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        String resourceEntryName;
        c(false);
        super.dispatchDraw(canvas);
        if (this.f17818a == null) {
            return;
        }
        if ((this.f17835t & 1) == 1 && !isInEditMode()) {
            this.E++;
            long nanoTime = getNanoTime();
            long j2 = this.F;
            if (j2 != -1) {
                if (nanoTime - j2 > 200000000) {
                    this.G = ((int) ((this.E / (((float) r5) * 1.0E-9f)) * 100.0f)) / 100.0f;
                    this.E = 0;
                    this.F = nanoTime;
                }
            } else {
                this.F = nanoTime;
            }
            Paint paint = new Paint();
            paint.setTextSize(42.0f);
            float progress = ((int) (getProgress() * 1000.0f)) / 10.0f;
            StringBuilder sb = new StringBuilder();
            sb.append(this.G);
            sb.append(" fps ");
            int i2 = this.d;
            StringBuilder q2 = a.q(d.r(sb, i2 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i2), " -> "));
            int i3 = this.f17822g;
            q2.append(i3 == -1 ? "UNDEFINED" : getContext().getResources().getResourceEntryName(i3));
            q2.append(" (progress: ");
            q2.append(progress);
            q2.append(" ) state=");
            int i4 = this.f17821f;
            if (i4 == -1) {
                resourceEntryName = AdError.UNDEFINED_DOMAIN;
            } else {
                resourceEntryName = i4 != -1 ? getContext().getResources().getResourceEntryName(i4) : "UNDEFINED";
            }
            q2.append(resourceEntryName);
            String sb2 = q2.toString();
            paint.setColor(-16777216);
            canvas.drawText(sb2, 11.0f, getHeight() - 29, paint);
            paint.setColor(-7864184);
            canvas.drawText(sb2, 10.0f, getHeight() - 30, paint);
        }
        if (this.f17835t > 1) {
            if (this.f17836u == null) {
                this.f17836u = new DevModeDraw(this);
            }
            DevModeDraw devModeDraw = this.f17836u;
            MotionScene.Transition transition = this.f17818a.f17851c;
            devModeDraw.getClass();
        }
    }

    public final void e() {
        ArrayList arrayList;
        if (!(this.f17834s == null && ((arrayList = this.D) == null || arrayList.isEmpty())) && this.H == -1) {
            this.H = this.f17821f;
            throw null;
        }
        if (this.f17834s != null) {
            throw null;
        }
        ArrayList arrayList2 = this.D;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, androidx.core.widget.NestedScrollView$OnScrollChangeListener] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, android.view.View$OnTouchListener] */
    public final void f() {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        View view;
        MotionScene motionScene = this.f17818a;
        if (motionScene == null) {
            return;
        }
        if (motionScene.a(this, this.f17821f)) {
            requestLayout();
            return;
        }
        int i2 = this.f17821f;
        if (i2 != -1) {
            MotionScene motionScene2 = this.f17818a;
            ArrayList arrayList = motionScene2.d;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MotionScene.Transition transition2 = (MotionScene.Transition) it.next();
                if (transition2.f17875m.size() > 0) {
                    Iterator it2 = transition2.f17875m.iterator();
                    while (it2.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it2.next()).b(this);
                    }
                }
            }
            ArrayList arrayList2 = motionScene2.f17852f;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                MotionScene.Transition transition3 = (MotionScene.Transition) it3.next();
                if (transition3.f17875m.size() > 0) {
                    Iterator it4 = transition3.f17875m.iterator();
                    while (it4.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it4.next()).b(this);
                    }
                }
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                MotionScene.Transition transition4 = (MotionScene.Transition) it5.next();
                if (transition4.f17875m.size() > 0) {
                    Iterator it6 = transition4.f17875m.iterator();
                    while (it6.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it6.next()).a(this, i2, transition4);
                    }
                }
            }
            Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                MotionScene.Transition transition5 = (MotionScene.Transition) it7.next();
                if (transition5.f17875m.size() > 0) {
                    Iterator it8 = transition5.f17875m.iterator();
                    while (it8.hasNext()) {
                        ((MotionScene.Transition.TransitionOnClick) it8.next()).a(this, i2, transition5);
                    }
                }
            }
        }
        if (!this.f17818a.k() || (transition = this.f17818a.f17851c) == null || (touchResponse = transition.f17874l) == null) {
            return;
        }
        int i3 = touchResponse.d;
        if (i3 != -1) {
            MotionLayout motionLayout = touchResponse.f17895m;
            view = motionLayout.findViewById(i3);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + Debug.a(touchResponse.d, motionLayout.getContext()));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new Object());
            nestedScrollView.setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener) new Object());
        }
    }

    public final void g(int i2, int i3) {
        if (!isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new StateCache();
            }
            StateCache stateCache = this.L;
            stateCache.f17845c = i2;
            stateCache.d = i3;
            return;
        }
        MotionScene motionScene = this.f17818a;
        if (motionScene == null) {
            return;
        }
        this.d = i2;
        this.f17822g = i3;
        motionScene.j(i2, i3);
        this.f17818a.b(i2);
        this.f17818a.b(i3);
        throw null;
    }

    public int[] getConstraintSetIds() {
        MotionScene motionScene = this.f17818a;
        if (motionScene == null) {
            return null;
        }
        SparseArray sparseArray = motionScene.f17853g;
        int size = sparseArray.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = sparseArray.keyAt(i2);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.f17821f;
    }

    public ArrayList<MotionScene.Transition> getDefinedTransitions() {
        MotionScene motionScene = this.f17818a;
        if (motionScene == null) {
            return null;
        }
        return motionScene.d;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, androidx.constraintlayout.motion.widget.DesignTool] */
    public DesignTool getDesignTool() {
        if (this.w == null) {
            this.w = new Object();
        }
        return this.w;
    }

    public int getEndState() {
        return this.f17822g;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f17829n;
    }

    public int getStartState() {
        return this.d;
    }

    public float getTargetPosition() {
        return this.f17831p;
    }

    public Bundle getTransitionState() {
        if (this.L == null) {
            this.L = new StateCache();
        }
        StateCache stateCache = this.L;
        MotionLayout motionLayout = MotionLayout.this;
        stateCache.d = motionLayout.f17822g;
        stateCache.f17845c = motionLayout.d;
        stateCache.f17844b = motionLayout.getVelocity();
        stateCache.f17843a = motionLayout.getProgress();
        StateCache stateCache2 = this.L;
        stateCache2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", stateCache2.f17843a);
        bundle.putFloat("motion.velocity", stateCache2.f17844b);
        bundle.putInt("motion.StartState", stateCache2.f17845c);
        bundle.putInt("motion.EndState", stateCache2.d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        MotionScene motionScene = this.f17818a;
        if (motionScene != null) {
            this.f17827l = (motionScene.f17851c != null ? r2.f17870h : motionScene.f17856j) / 1000.0f;
        }
        return this.f17827l * 1000.0f;
    }

    public float getVelocity() {
        return this.f17820c;
    }

    public final void h(int i2) {
        StateSet stateSet;
        float f2;
        int a2;
        if (!isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new StateCache();
            }
            this.L.d = i2;
            return;
        }
        MotionScene motionScene = this.f17818a;
        if (motionScene != null && (stateSet = motionScene.f17850b) != null && (a2 = stateSet.a(-1, f2, this.f17821f, i2)) != -1) {
            i2 = a2;
        }
        int i3 = this.f17821f;
        if (i3 == i2) {
            return;
        }
        if (this.d == i2) {
            b(0.0f);
            return;
        }
        if (this.f17822g == i2) {
            b(1.0f);
            return;
        }
        this.f17822g = i2;
        if (i3 != -1) {
            g(i3, i2);
            b(1.0f);
            this.f17829n = 0.0f;
            b(1.0f);
            return;
        }
        this.f17837v = false;
        this.f17831p = 1.0f;
        this.f17828m = 0.0f;
        this.f17829n = 0.0f;
        this.f17830o = getNanoTime();
        this.f17826k = getNanoTime();
        this.f17832q = false;
        this.f17819b = null;
        MotionScene motionScene2 = this.f17818a;
        this.f17827l = (motionScene2.f17851c != null ? r2.f17870h : motionScene2.f17856j) / 1000.0f;
        this.d = -1;
        motionScene2.j(-1, this.f17822g);
        MotionScene.Transition transition = this.f17818a.f17851c;
        getChildCount();
        throw null;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void loadLayoutDescription(int i2) {
        if (i2 == 0) {
            this.f17818a = null;
            return;
        }
        try {
            this.f17818a = new MotionScene(getContext(), this, i2);
            if (isAttachedToWindow()) {
                this.f17818a.i(this);
                this.f17818a.b(this.d);
                this.f17818a.b(this.f17822g);
                throw null;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException("unable to parse MotionScene file", e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        MotionScene motionScene = this.f17818a;
        if (motionScene != null && (i2 = this.f17821f) != -1) {
            ConstraintSet b2 = motionScene.b(i2);
            this.f17818a.i(this);
            if (b2 != null) {
                b2.b(this);
            }
            this.d = this.f17821f;
        }
        f();
        StateCache stateCache = this.L;
        if (stateCache != null) {
            stateCache.a();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        int i2;
        RectF a2;
        MotionScene motionScene = this.f17818a;
        if (motionScene != null && this.f17825j && (transition = motionScene.f17851c) != null && (!transition.f17877o) && (touchResponse = transition.f17874l) != null && ((motionEvent.getAction() != 0 || (a2 = touchResponse.a(this, new RectF())) == null || a2.contains(motionEvent.getX(), motionEvent.getY())) && (i2 = touchResponse.e) != -1)) {
            View view = this.O;
            if (view == null || view.getId() != i2) {
                this.O = findViewById(i2);
            }
            View view2 = this.O;
            if (view2 != null) {
                view2.getLeft();
                this.O.getTop();
                this.O.getRight();
                this.O.getBottom();
                throw null;
            }
        }
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.K = true;
        try {
            if (this.f17818a == null) {
                super.onLayout(z2, i2, i3, i4, i5);
                return;
            }
            int i6 = i4 - i2;
            int i7 = i5 - i3;
            if (this.x != i6 || this.f17838y != i7) {
                throw null;
            }
            this.x = i6;
            this.f17838y = i7;
        } finally {
            this.K = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        if (this.f17818a == null) {
            super.onMeasure(i2, i3);
            return;
        }
        boolean z2 = true;
        boolean z3 = (this.f17823h == i2 && this.f17824i == i3) ? false : true;
        if (this.N) {
            this.N = false;
            f();
            if (this.f17834s != null) {
                throw null;
            }
            ArrayList arrayList = this.D;
            if (arrayList != null && !arrayList.isEmpty()) {
                throw null;
            }
            z3 = true;
        }
        if (this.mDirtyHierarchy) {
            z3 = true;
        }
        this.f17823h = i2;
        this.f17824i = i3;
        MotionScene.Transition transition = this.f17818a.f17851c;
        int i4 = transition == null ? -1 : transition.d;
        int i5 = transition == null ? -1 : transition.f17867c;
        if (!z3) {
            throw null;
        }
        if (this.d != -1) {
            super.onMeasure(i2, i3);
            this.f17818a.b(i4);
            this.f17818a.b(i5);
            throw null;
        }
        getPaddingTop();
        getPaddingBottom();
        getPaddingLeft();
        getPaddingRight();
        this.mLayoutWidget.getClass();
        this.mLayoutWidget.getClass();
        float f2 = 0;
        int i6 = (int) ((this.J * f2) + f2);
        requestLayout();
        int i7 = (int) ((this.J * f2) + f2);
        requestLayout();
        setMeasuredDimension(i6, i7);
        float signum = Math.signum(this.f17831p - this.f17829n);
        long nanoTime = getNanoTime();
        Interpolator interpolator = this.f17819b;
        float f3 = this.f17829n + (!(interpolator instanceof StopLogic) ? ((((float) (nanoTime - this.f17830o)) * signum) * 1.0E-9f) / this.f17827l : 0.0f);
        if (this.f17832q) {
            f3 = this.f17831p;
        }
        if ((signum <= 0.0f || f3 < this.f17831p) && (signum > 0.0f || f3 > this.f17831p)) {
            z2 = false;
        } else {
            f3 = this.f17831p;
        }
        if (interpolator != null && !z2) {
            f3 = this.f17837v ? interpolator.getInterpolation(((float) (nanoTime - this.f17826k)) * 1.0E-9f) : interpolator.getInterpolation(f3);
        }
        if ((signum > 0.0f && f3 >= this.f17831p) || (signum <= 0.0f && f3 <= this.f17831p)) {
            f3 = this.f17831p;
        }
        this.J = f3;
        int childCount = getChildCount();
        getNanoTime();
        if (childCount <= 0) {
            return;
        }
        getChildAt(0);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr, int i4) {
        MotionScene.Transition transition;
        boolean z2;
        TouchResponse touchResponse;
        MotionScene.Transition transition2;
        TouchResponse touchResponse2;
        TouchResponse touchResponse3;
        int i5;
        MotionScene motionScene = this.f17818a;
        if (motionScene == null || (transition = motionScene.f17851c) == null || !(!transition.f17877o)) {
            return;
        }
        if (!z2 || (touchResponse3 = transition.f17874l) == null || (i5 = touchResponse3.e) == -1 || view.getId() == i5) {
            MotionScene motionScene2 = this.f17818a;
            if (motionScene2 != null && (transition2 = motionScene2.f17851c) != null && (touchResponse2 = transition2.f17874l) != null && touchResponse2.f17898p) {
                float f2 = this.f17828m;
                if ((f2 == 1.0f || f2 == 0.0f) && view.canScrollVertically(-1)) {
                    return;
                }
            }
            if (transition.f17874l != null) {
                TouchResponse touchResponse4 = this.f17818a.f17851c.f17874l;
                if ((touchResponse4.f17900r & 1) != 0) {
                    MotionLayout motionLayout = touchResponse4.f17895m;
                    motionLayout.getProgress();
                    motionLayout.getViewById(touchResponse4.d);
                    throw null;
                }
            }
            float f3 = this.f17828m;
            getNanoTime();
            MotionScene.Transition transition3 = this.f17818a.f17851c;
            if (transition3 != null && (touchResponse = transition3.f17874l) != null) {
                MotionLayout motionLayout2 = touchResponse.f17895m;
                float progress = motionLayout2.getProgress();
                if (!touchResponse.f17891i) {
                    touchResponse.f17891i = true;
                    motionLayout2.setProgress(progress);
                }
                motionLayout2.getViewById(touchResponse.d);
                throw null;
            }
            if (f3 != this.f17828m) {
                iArr[0] = i2;
                iArr[1] = i3;
            }
            c(false);
            if (iArr[0] == 0 && iArr[1] == 0) {
                return;
            }
            this.f17839z = true;
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6) {
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onNestedScrollAccepted(View view, View view2, int i2, int i3) {
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        TouchResponse touchResponse;
        MotionScene motionScene = this.f17818a;
        if (motionScene != null) {
            boolean isRtl = isRtl();
            motionScene.f17861o = isRtl;
            MotionScene.Transition transition = motionScene.f17851c;
            if (transition == null || (touchResponse = transition.f17874l) == null) {
                return;
            }
            touchResponse.b(isRtl);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final boolean onStartNestedScroll(View view, View view2, int i2, int i3) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        MotionScene motionScene = this.f17818a;
        return (motionScene == null || (transition = motionScene.f17851c) == null || (touchResponse = transition.f17874l) == null || (touchResponse.f17900r & 2) != 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public final void onStopNestedScroll(View view, int i2) {
        MotionScene.Transition transition;
        TouchResponse touchResponse;
        MotionScene motionScene = this.f17818a;
        if (motionScene == null || (transition = motionScene.f17851c) == null || (touchResponse = transition.f17874l) == null) {
            return;
        }
        touchResponse.f17891i = false;
        MotionLayout motionLayout = touchResponse.f17895m;
        motionLayout.getProgress();
        motionLayout.getViewById(touchResponse.d);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:199:0x03ae, code lost:
    
        if ((((r5 * r4) - (((r2 * r4) * r4) / 2.0f)) + r1) > 1.0f) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03c7, code lost:
    
        r9.f17818a.e();
        r9.f17818a.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03d1, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03c0, code lost:
    
        r9.f17818a.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03c6, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03be, code lost:
    
        if ((((((r2 * r4) * r4) / 2.0f) + (r5 * r4)) + r1) < 0.0f) goto L204;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.D == null) {
                this.D = new ArrayList();
            }
            this.D.add(motionHelper);
            motionHelper.getClass();
            motionHelper.getClass();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList arrayList2 = this.C;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void parseLayoutDescription(int i2) {
        this.mConstraintLayoutSpec = null;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        MotionScene motionScene;
        MotionScene.Transition transition;
        if (this.f17821f != -1 || (motionScene = this.f17818a) == null || (transition = motionScene.f17851c) == null || transition.f17878p != 0) {
            super.requestLayout();
        }
    }

    public void setDebugMode(int i2) {
        this.f17835t = i2;
        invalidate();
    }

    public void setInteractionEnabled(boolean z2) {
        this.f17825j = z2;
    }

    public void setInterpolatedProgress(float f2) {
        if (this.f17818a != null) {
            setState(TransitionState.f17847b);
            Interpolator d = this.f17818a.d();
            if (d != null) {
                setProgress(d.getInterpolation(f2));
                return;
            }
        }
        setProgress(f2);
    }

    public void setOnHide(float f2) {
        ArrayList arrayList = this.C;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((MotionHelper) this.C.get(i2)).setProgress(f2);
            }
        }
    }

    public void setOnShow(float f2) {
        ArrayList arrayList = this.B;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((MotionHelper) this.B.get(i2)).setProgress(f2);
            }
        }
    }

    public void setProgress(float f2) {
        if (!isAttachedToWindow()) {
            if (this.L == null) {
                this.L = new StateCache();
            }
            this.L.f17843a = f2;
            return;
        }
        TransitionState transitionState = TransitionState.f17848c;
        if (f2 <= 0.0f) {
            this.f17821f = this.d;
            if (this.f17829n == 0.0f) {
                setState(transitionState);
            }
        } else if (f2 >= 1.0f) {
            this.f17821f = this.f17822g;
            if (this.f17829n == 1.0f) {
                setState(transitionState);
            }
        } else {
            this.f17821f = -1;
            setState(TransitionState.f17847b);
        }
        if (this.f17818a == null) {
            return;
        }
        this.f17832q = true;
        this.f17831p = f2;
        this.f17828m = f2;
        this.f17830o = -1L;
        this.f17826k = -1L;
        this.f17819b = null;
        this.f17833r = true;
        invalidate();
    }

    public void setScene(MotionScene motionScene) {
        TouchResponse touchResponse;
        this.f17818a = motionScene;
        boolean isRtl = isRtl();
        motionScene.f17861o = isRtl;
        MotionScene.Transition transition = motionScene.f17851c;
        if (transition != null && (touchResponse = transition.f17874l) != null) {
            touchResponse.b(isRtl);
        }
        throw null;
    }

    public void setState(TransitionState transitionState) {
        TransitionState transitionState2 = TransitionState.f17848c;
        if (transitionState == transitionState2 && this.f17821f == -1) {
            return;
        }
        TransitionState transitionState3 = this.M;
        this.M = transitionState;
        TransitionState transitionState4 = TransitionState.f17847b;
        if (transitionState3 == transitionState4 && transitionState == transitionState4) {
            d();
        }
        int ordinal = transitionState3.ordinal();
        if (ordinal != 0 && ordinal != 1) {
            if (ordinal == 2 && transitionState == transitionState2) {
                e();
                return;
            }
            return;
        }
        if (transitionState == transitionState4) {
            d();
        }
        if (transitionState == transitionState2) {
            e();
        }
    }

    public void setTransition(MotionScene.Transition transition) {
        TouchResponse touchResponse;
        MotionScene motionScene = this.f17818a;
        motionScene.f17851c = transition;
        if (transition != null && (touchResponse = transition.f17874l) != null) {
            touchResponse.b(motionScene.f17861o);
        }
        setState(TransitionState.f17846a);
        int i2 = this.f17821f;
        MotionScene.Transition transition2 = this.f17818a.f17851c;
        if (i2 == (transition2 == null ? -1 : transition2.f17867c)) {
            this.f17829n = 1.0f;
            this.f17828m = 1.0f;
            this.f17831p = 1.0f;
        } else {
            this.f17829n = 0.0f;
            this.f17828m = 0.0f;
            this.f17831p = 0.0f;
        }
        this.f17830o = (transition.f17879q & 1) != 0 ? -1L : getNanoTime();
        MotionScene motionScene2 = this.f17818a;
        MotionScene.Transition transition3 = motionScene2.f17851c;
        int i3 = transition3 == null ? -1 : transition3.d;
        int i4 = transition3 != null ? transition3.f17867c : -1;
        if (i3 == this.d && i4 == this.f17822g) {
            return;
        }
        this.d = i3;
        this.f17822g = i4;
        motionScene2.j(i3, i4);
        this.f17818a.b(this.d);
        this.f17818a.b(this.f17822g);
        throw null;
    }

    public void setTransitionDuration(int i2) {
        MotionScene motionScene = this.f17818a;
        if (motionScene == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        MotionScene.Transition transition = motionScene.f17851c;
        if (transition != null) {
            transition.f17870h = i2;
        } else {
            motionScene.f17856j = i2;
        }
    }

    public void setTransitionListener(TransitionListener transitionListener) {
        this.f17834s = transitionListener;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.L == null) {
            this.L = new StateCache();
        }
        StateCache stateCache = this.L;
        stateCache.getClass();
        stateCache.f17843a = bundle.getFloat("motion.progress");
        stateCache.f17844b = bundle.getFloat("motion.velocity");
        stateCache.f17845c = bundle.getInt("motion.StartState");
        stateCache.d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.L.a();
        }
    }

    @Override // android.view.View
    public final String toString() {
        Context context = getContext();
        return Debug.a(this.d, context) + "->" + Debug.a(this.f17822g, context) + " (pos:" + this.f17829n + " Dpos/Dt:" + this.f17820c;
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        if (this.f17839z || i2 != 0 || i3 != 0) {
            iArr[0] = iArr[0] + i4;
            iArr[1] = iArr[1] + i5;
        }
        this.f17839z = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void setState(int i2, int i3, int i4) {
        setState(TransitionState.f17846a);
        this.f17821f = i2;
        this.d = -1;
        this.f17822g = -1;
        ConstraintLayoutStates constraintLayoutStates = this.mConstraintLayoutSpec;
        if (constraintLayoutStates != null) {
            constraintLayoutStates.b(i3, i4, i2);
            return;
        }
        MotionScene motionScene = this.f17818a;
        if (motionScene != null) {
            motionScene.b(i2).b(this);
        }
    }

    public void setTransition(int i2) {
        MotionScene.Transition transition;
        MotionScene motionScene = this.f17818a;
        if (motionScene != null) {
            Iterator it = motionScene.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    transition = null;
                    break;
                } else {
                    transition = (MotionScene.Transition) it.next();
                    if (transition.f17865a == i2) {
                        break;
                    }
                }
            }
            this.d = transition.d;
            this.f17822g = transition.f17867c;
            if (!isAttachedToWindow()) {
                if (this.L == null) {
                    this.L = new StateCache();
                }
                StateCache stateCache = this.L;
                stateCache.f17845c = this.d;
                stateCache.d = this.f17822g;
                return;
            }
            MotionScene motionScene2 = this.f17818a;
            motionScene2.f17851c = transition;
            TouchResponse touchResponse = transition.f17874l;
            if (touchResponse != null) {
                touchResponse.b(motionScene2.f17861o);
            }
            this.f17818a.b(this.d);
            this.f17818a.b(this.f17822g);
            throw null;
        }
    }
}
