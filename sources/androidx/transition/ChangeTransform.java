package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.transition.PropertyValuesHolderUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class ChangeTransform extends Transition {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f21544a = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: b, reason: collision with root package name */
    public static final Property f21545b = new Property(float[].class, "nonTranslations");

    /* renamed from: c, reason: collision with root package name */
    public static final Property f21546c = new Property(PointF.class, "translations");
    public static final boolean d = true;

    /* renamed from: androidx.transition.ChangeTransform$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends Property<PathAnimatorMatrix, float[]> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public final void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            float[] fArr2 = fArr;
            pathAnimatorMatrix2.getClass();
            System.arraycopy(fArr2, 0, pathAnimatorMatrix2.f21555c, 0, fArr2.length);
            pathAnimatorMatrix2.a();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends Property<PathAnimatorMatrix, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public final void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            PointF pointF2 = pointF;
            pathAnimatorMatrix2.getClass();
            pathAnimatorMatrix2.d = pointF2.x;
            pathAnimatorMatrix2.e = pointF2.y;
            pathAnimatorMatrix2.a();
        }
    }

    /* loaded from: classes2.dex */
    public static class GhostListener extends TransitionListenerAdapter {
        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            if (Build.VERSION.SDK_INT != 28) {
                int i2 = GhostViewPort.f21578c;
                throw null;
            }
            if (!GhostViewPlatform.d) {
                try {
                    if (!GhostViewPlatform.f21576b) {
                        try {
                            GhostViewPlatform.f21575a = Class.forName("android.view.GhostView");
                        } catch (ClassNotFoundException e) {
                            Log.i("GhostViewApi21", "Failed to retrieve GhostView class", e);
                        }
                        GhostViewPlatform.f21576b = true;
                    }
                    Method declaredMethod = GhostViewPlatform.f21575a.getDeclaredMethod("removeGhost", View.class);
                    GhostViewPlatform.f21577c = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e2) {
                    Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
                }
                GhostViewPlatform.d = true;
            }
            Method method = GhostViewPlatform.f21577c;
            if (method == null) {
                throw null;
            }
            try {
                method.invoke(null, null);
                throw null;
            } catch (IllegalAccessException unused) {
                throw null;
            } catch (InvocationTargetException e3) {
                throw new RuntimeException(e3.getCause());
            }
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            throw null;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            throw null;
        }
    }

    /* loaded from: classes2.dex */
    public static class Listener extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f21547a;

        /* renamed from: b, reason: collision with root package name */
        public final Matrix f21548b = new Matrix();

        /* renamed from: c, reason: collision with root package name */
        public final boolean f21549c = false;
        public final boolean d = false;
        public final View e;

        /* renamed from: f, reason: collision with root package name */
        public final Transforms f21550f;

        /* renamed from: g, reason: collision with root package name */
        public final PathAnimatorMatrix f21551g;

        /* renamed from: h, reason: collision with root package name */
        public final Matrix f21552h;

        public Listener(View view, Transforms transforms, PathAnimatorMatrix pathAnimatorMatrix, Matrix matrix) {
            this.e = view;
            this.f21550f = transforms;
            this.f21551g = pathAnimatorMatrix;
            this.f21552h = matrix;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f21547a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            boolean z2 = this.f21547a;
            Transforms transforms = this.f21550f;
            View view = this.e;
            if (!z2) {
                if (this.f21549c && this.d) {
                    Matrix matrix = this.f21548b;
                    matrix.set(this.f21552h);
                    view.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_transform, matrix);
                    transforms.getClass();
                    String[] strArr = ChangeTransform.f21544a;
                    view.setTranslationX(transforms.f21556a);
                    view.setTranslationY(transforms.f21557b);
                    ViewCompat.N(view, transforms.f21558c);
                    view.setScaleX(transforms.d);
                    view.setScaleY(transforms.e);
                    view.setRotationX(transforms.f21559f);
                    view.setRotationY(transforms.f21560g);
                    view.setRotation(transforms.f21561h);
                } else {
                    view.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_transform, null);
                    view.setTag(com.cooldev.gba.emulator.gameboy.R.id.parent_matrix, null);
                }
            }
            ViewUtils.f21626a.d(view, null);
            transforms.getClass();
            String[] strArr2 = ChangeTransform.f21544a;
            view.setTranslationX(transforms.f21556a);
            view.setTranslationY(transforms.f21557b);
            ViewCompat.N(view, transforms.f21558c);
            view.setScaleX(transforms.d);
            view.setScaleY(transforms.e);
            view.setRotationX(transforms.f21559f);
            view.setRotationY(transforms.f21560g);
            view.setRotation(transforms.f21561h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = this.f21551g.f21553a;
            Matrix matrix2 = this.f21548b;
            matrix2.set(matrix);
            View view = this.e;
            view.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_transform, matrix2);
            Transforms transforms = this.f21550f;
            transforms.getClass();
            String[] strArr = ChangeTransform.f21544a;
            view.setTranslationX(transforms.f21556a);
            view.setTranslationY(transforms.f21557b);
            ViewCompat.N(view, transforms.f21558c);
            view.setScaleX(transforms.d);
            view.setScaleY(transforms.e);
            view.setRotationX(transforms.f21559f);
            view.setRotationY(transforms.f21560g);
            view.setRotation(transforms.f21561h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            String[] strArr = ChangeTransform.f21544a;
            View view = this.e;
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            ViewCompat.N(view, 0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotationX(0.0f);
            view.setRotationY(0.0f);
            view.setRotation(0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public static class PathAnimatorMatrix {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f21553a = new Matrix();

        /* renamed from: b, reason: collision with root package name */
        public final View f21554b;

        /* renamed from: c, reason: collision with root package name */
        public final float[] f21555c;
        public float d;
        public float e;

        public PathAnimatorMatrix(View view, float[] fArr) {
            this.f21554b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f21555c = fArr2;
            this.d = fArr2[2];
            this.e = fArr2[5];
            a();
        }

        public final void a() {
            float f2 = this.d;
            float[] fArr = this.f21555c;
            fArr[2] = f2;
            fArr[5] = this.e;
            Matrix matrix = this.f21553a;
            matrix.setValues(fArr);
            ViewUtils.f21626a.d(this.f21554b, matrix);
        }
    }

    /* loaded from: classes2.dex */
    public static class Transforms {

        /* renamed from: a, reason: collision with root package name */
        public final float f21556a;

        /* renamed from: b, reason: collision with root package name */
        public final float f21557b;

        /* renamed from: c, reason: collision with root package name */
        public final float f21558c;
        public final float d;
        public final float e;

        /* renamed from: f, reason: collision with root package name */
        public final float f21559f;

        /* renamed from: g, reason: collision with root package name */
        public final float f21560g;

        /* renamed from: h, reason: collision with root package name */
        public final float f21561h;

        public Transforms(View view) {
            this.f21556a = view.getTranslationX();
            this.f21557b = view.getTranslationY();
            this.f21558c = ViewCompat.p(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f21559f = view.getRotationX();
            this.f21560g = view.getRotationY();
            this.f21561h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            return transforms.f21556a == this.f21556a && transforms.f21557b == this.f21557b && transforms.f21558c == this.f21558c && transforms.d == this.d && transforms.e == this.e && transforms.f21559f == this.f21559f && transforms.f21560g == this.f21560g && transforms.f21561h == this.f21561h;
        }

        public final int hashCode() {
            float f2 = this.f21556a;
            int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.f21557b;
            int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f21558c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f21559f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f21560g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.f21561h;
            return floatToIntBits7 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0);
        }
    }

    public static void g(TransitionValues transitionValues) {
        View view = transitionValues.f21618b;
        if (view.getVisibility() == 8) {
            return;
        }
        HashMap hashMap = transitionValues.f21617a;
        hashMap.put("android:changeTransform:parent", view.getParent());
        hashMap.put("android:changeTransform:transforms", new Transforms(view));
        Matrix matrix = view.getMatrix();
        hashMap.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        g(transitionValues);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        g(transitionValues);
        if (d) {
            return;
        }
        ((ViewGroup) transitionValues.f21618b.getParent()).startViewTransition(transitionValues.f21618b);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.transition.FloatArrayEvaluator, android.animation.TypeEvaluator, java.lang.Object] */
    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        ObjectAnimator objectAnimator = null;
        if (transitionValues != null && transitionValues2 != null) {
            HashMap hashMap = transitionValues.f21617a;
            if (hashMap.containsKey("android:changeTransform:parent")) {
                HashMap hashMap2 = transitionValues2.f21617a;
                if (hashMap2.containsKey("android:changeTransform:parent")) {
                    ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeTransform:parent");
                    Matrix matrix = (Matrix) hashMap.get("android:changeTransform:intermediateMatrix");
                    if (matrix != null) {
                        hashMap.put("android:changeTransform:matrix", matrix);
                    }
                    Matrix matrix2 = (Matrix) hashMap.get("android:changeTransform:intermediateParentMatrix");
                    if (matrix2 != null) {
                        hashMap.put("android:changeTransform:parentMatrix", matrix2);
                    }
                    Matrix matrix3 = (Matrix) hashMap.get("android:changeTransform:matrix");
                    Matrix matrix4 = (Matrix) hashMap2.get("android:changeTransform:matrix");
                    if (matrix3 == null) {
                        matrix3 = MatrixUtils.f21582a;
                    }
                    if (matrix4 == null) {
                        matrix4 = MatrixUtils.f21582a;
                    }
                    if (!matrix3.equals(matrix4)) {
                        Transforms transforms = (Transforms) hashMap2.get("android:changeTransform:transforms");
                        View view = transitionValues2.f21618b;
                        view.setTranslationX(0.0f);
                        view.setTranslationY(0.0f);
                        ViewCompat.N(view, 0.0f);
                        view.setScaleX(1.0f);
                        view.setScaleY(1.0f);
                        view.setRotationX(0.0f);
                        view.setRotationY(0.0f);
                        view.setRotation(0.0f);
                        float[] fArr = new float[9];
                        matrix3.getValues(fArr);
                        float[] fArr2 = new float[9];
                        matrix4.getValues(fArr2);
                        PathAnimatorMatrix pathAnimatorMatrix = new PathAnimatorMatrix(view, fArr);
                        Property property = f21545b;
                        ?? obj = new Object();
                        obj.f21564a = new float[9];
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(pathAnimatorMatrix, PropertyValuesHolder.ofObject(property, (TypeEvaluator) obj, fArr, fArr2), PropertyValuesHolderUtils.Api21Impl.a(f21546c, getPathMotion().getPath(fArr[2], fArr[5], fArr2[2], fArr2[5])));
                        Listener listener = new Listener(view, transforms, pathAnimatorMatrix, matrix4);
                        ofPropertyValuesHolder.addListener(listener);
                        ofPropertyValuesHolder.addPauseListener(listener);
                        objectAnimator = ofPropertyValuesHolder;
                    }
                    if (!d) {
                        viewGroup2.endViewTransition(transitionValues.f21618b);
                    }
                }
            }
        }
        return objectAnimator;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f21544a;
    }
}
