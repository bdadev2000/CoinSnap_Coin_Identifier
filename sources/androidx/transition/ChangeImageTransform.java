package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import androidx.transition.TransitionUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ChangeImageTransform extends Transition {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f21536a = {"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};

    /* renamed from: b, reason: collision with root package name */
    public static final TypeEvaluator f21537b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final Property f21538c = new Property(Matrix.class, "animatedTransform");

    /* renamed from: androidx.transition.ChangeImageTransform$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        public final /* bridge */ /* synthetic */ Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 extends Property<ImageView, Matrix> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Matrix matrix) {
            ImageViewUtils.a(imageView, matrix);
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21539a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f21539a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21539a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a, reason: collision with root package name */
        public final ImageView f21540a;

        /* renamed from: b, reason: collision with root package name */
        public final Matrix f21541b;

        /* renamed from: c, reason: collision with root package name */
        public final Matrix f21542c;
        public boolean d = true;

        public Listener(ImageView imageView, Matrix matrix, Matrix matrix2) {
            this.f21540a = imageView;
            this.f21541b = matrix;
            this.f21542c = matrix2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.d = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            Matrix matrix = (Matrix) ((ObjectAnimator) animator).getAnimatedValue();
            ImageView imageView = this.f21540a;
            imageView.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_image_transform, matrix);
            ImageViewUtils.a(imageView, this.f21542c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            ImageView imageView = this.f21540a;
            Matrix matrix = (Matrix) imageView.getTag(com.cooldev.gba.emulator.gameboy.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.a(imageView, matrix);
                imageView.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_image_transform, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            this.d = false;
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionEnd(Transition transition) {
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionPause(Transition transition) {
            if (this.d) {
                ImageView imageView = this.f21540a;
                imageView.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_image_transform, this.f21541b);
                ImageViewUtils.a(imageView, this.f21542c);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionResume(Transition transition) {
            ImageView imageView = this.f21540a;
            Matrix matrix = (Matrix) imageView.getTag(com.cooldev.gba.emulator.gameboy.R.id.transition_image_transform);
            if (matrix != null) {
                ImageViewUtils.a(imageView, matrix);
                imageView.setTag(com.cooldev.gba.emulator.gameboy.R.id.transition_image_transform, null);
            }
        }

        @Override // androidx.transition.Transition.TransitionListener
        public final void onTransitionStart(Transition transition) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator, boolean z2) {
            this.d = z2;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator, boolean z2) {
            this.d = false;
        }
    }

    public static void g(TransitionValues transitionValues, boolean z2) {
        Matrix matrix;
        View view = transitionValues.f21618b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            HashMap hashMap = transitionValues.f21617a;
            hashMap.put("android:changeImageTransform:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            Matrix matrix2 = z2 ? (Matrix) imageView.getTag(com.cooldev.gba.emulator.gameboy.R.id.transition_image_transform) : null;
            if (matrix2 == null) {
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
                    matrix2 = new Matrix(imageView.getImageMatrix());
                } else {
                    int i2 = AnonymousClass3.f21539a[imageView.getScaleType().ordinal()];
                    if (i2 == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = new Matrix();
                        matrix.postScale(imageView.getWidth() / drawable2.getIntrinsicWidth(), imageView.getHeight() / drawable2.getIntrinsicHeight());
                    } else if (i2 != 2) {
                        matrix2 = new Matrix(imageView.getImageMatrix());
                    } else {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float width = imageView.getWidth();
                        float f2 = intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float height = imageView.getHeight();
                        float f3 = intrinsicHeight;
                        float max = Math.max(width / f2, height / f3);
                        int round = Math.round((width - (f2 * max)) / 2.0f);
                        int round2 = Math.round((height - (f3 * max)) / 2.0f);
                        matrix = new Matrix();
                        matrix.postScale(max, max);
                        matrix.postTranslate(round, round2);
                    }
                    matrix2 = matrix;
                }
            }
            hashMap.put("android:changeImageTransform:matrix", matrix2);
        }
    }

    @Override // androidx.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        g(transitionValues, false);
    }

    @Override // androidx.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        g(transitionValues, true);
    }

    @Override // androidx.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues != null && transitionValues2 != null) {
            HashMap hashMap = transitionValues.f21617a;
            Rect rect = (Rect) hashMap.get("android:changeImageTransform:bounds");
            HashMap hashMap2 = transitionValues2.f21617a;
            Rect rect2 = (Rect) hashMap2.get("android:changeImageTransform:bounds");
            if (rect != null && rect2 != null) {
                Matrix matrix = (Matrix) hashMap.get("android:changeImageTransform:matrix");
                Matrix matrix2 = (Matrix) hashMap2.get("android:changeImageTransform:matrix");
                boolean z2 = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
                if (rect.equals(rect2) && z2) {
                    return null;
                }
                ImageView imageView = (ImageView) transitionValues2.f21618b;
                Drawable drawable = imageView.getDrawable();
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Property property = f21538c;
                if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                    TypeEvaluator typeEvaluator = f21537b;
                    Matrix matrix3 = MatrixUtils.f21582a;
                    return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, typeEvaluator, matrix3, matrix3);
                }
                if (matrix == null) {
                    matrix = MatrixUtils.f21582a;
                }
                if (matrix2 == null) {
                    matrix2 = MatrixUtils.f21582a;
                }
                property.set(imageView, matrix);
                ObjectAnimator ofObject = ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, new TransitionUtils.MatrixEvaluator(), matrix, matrix2);
                Listener listener = new Listener(imageView, matrix, matrix2);
                ofObject.addListener(listener);
                ofObject.addPauseListener(listener);
                addListener(listener);
                return ofObject;
            }
        }
        return null;
    }

    @Override // androidx.transition.Transition
    public final String[] getTransitionProperties() {
        return f21536a;
    }

    @Override // androidx.transition.Transition
    public final boolean isSeekingSupported() {
        return true;
    }
}
