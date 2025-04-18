package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.transition.Transition;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {
    static final boolean DBG = false;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private ArrayList<TransitionValues> mEndValuesList;
    private EpicenterCallback mEpicenterCallback;
    private TransitionListener[] mListenersCache;
    private ArrayMap<String, String> mNameOverrides;
    TransitionPropagation mPropagation;
    SeekController mSeekController;
    long mSeekOffsetInParent;
    private ArrayList<TransitionValues> mStartValuesList;
    long mTotalDuration;
    private static final Animator[] EMPTY_ANIMATOR_ARRAY = new Animator[0];
    private static final int[] DEFAULT_MATCH_ORDER = {2, 1, 3, 4};
    private static final PathMotion STRAIGHT_PATH_MOTION = new Object();
    private static ThreadLocal<ArrayMap<Animator, AnimationInfo>> sRunningAnimators = new ThreadLocal<>();
    private String mName = getClass().getName();
    private long mStartDelay = -1;
    long mDuration = -1;
    private TimeInterpolator mInterpolator = null;
    ArrayList<Integer> mTargetIds = new ArrayList<>();
    ArrayList<View> mTargets = new ArrayList<>();
    private ArrayList<String> mTargetNames = null;
    private ArrayList<Class<?>> mTargetTypes = null;
    private ArrayList<Integer> mTargetIdExcludes = null;
    private ArrayList<View> mTargetExcludes = null;
    private ArrayList<Class<?>> mTargetTypeExcludes = null;
    private ArrayList<String> mTargetNameExcludes = null;
    private ArrayList<Integer> mTargetIdChildExcludes = null;
    private ArrayList<View> mTargetChildExcludes = null;
    private ArrayList<Class<?>> mTargetTypeChildExcludes = null;
    private TransitionValuesMaps mStartValues = new TransitionValuesMaps();
    private TransitionValuesMaps mEndValues = new TransitionValuesMaps();
    TransitionSet mParent = null;
    private int[] mMatchOrder = DEFAULT_MATCH_ORDER;
    boolean mCanRemoveViews = false;
    ArrayList<Animator> mCurrentAnimators = new ArrayList<>();
    private Animator[] mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
    int mNumInstances = 0;
    private boolean mPaused = false;
    boolean mEnded = false;
    private Transition mCloneParent = null;
    private ArrayList<TransitionListener> mListeners = null;
    ArrayList<Animator> mAnimators = new ArrayList<>();
    private PathMotion mPathMotion = STRAIGHT_PATH_MOTION;

    /* renamed from: androidx.transition.Transition$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 extends PathMotion {
        @Override // androidx.transition.PathMotion
        public final Path getPath(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    /* loaded from: classes.dex */
    public static class AnimationInfo {

        /* renamed from: a, reason: collision with root package name */
        public View f21590a;

        /* renamed from: b, reason: collision with root package name */
        public String f21591b;

        /* renamed from: c, reason: collision with root package name */
        public TransitionValues f21592c;
        public WindowId d;
        public Transition e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f21593f;
    }

    /* loaded from: classes.dex */
    public static class ArrayListManager {
        public static ArrayList a(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
            return arrayList;
        }

        public static ArrayList b(Object obj, ArrayList arrayList) {
            if (arrayList == null) {
                return arrayList;
            }
            arrayList.remove(obj);
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class EpicenterCallback {
        public abstract Rect a();
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Impl26 {
        @DoNotInline
        public static long a(Animator animator) {
            return animator.getTotalDuration();
        }

        @DoNotInline
        public static void b(Animator animator, long j2) {
            ((AnimatorSet) animator).setCurrentPlayTime(j2);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface MatchOrder {
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public class SeekController extends TransitionListenerAdapter implements TransitionSeekController, DynamicAnimation.OnAnimationUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public long f21594a = -1;

        public SeekController() {
            Arrays.fill(new long[20], Long.MIN_VALUE);
        }

        @Override // androidx.dynamicanimation.animation.DynamicAnimation.OnAnimationUpdateListener
        public final void a(float f2) {
            Transition transition = Transition.this;
            long max = Math.max(-1L, Math.min(transition.getTotalDurationMillis() + 1, Math.round(f2)));
            transition.setCurrentPlayTimeMillis(max, this.f21594a);
            this.f21594a = max;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void onTransitionCancel(Transition transition) {
        }
    }

    /* loaded from: classes.dex */
    public interface TransitionListener {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        default void onTransitionEnd(Transition transition, boolean z2) {
            onTransitionEnd(transition);
        }

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);

        default void onTransitionStart(Transition transition, boolean z2) {
            onTransitionStart(transition);
        }
    }

    /* loaded from: classes.dex */
    public interface TransitionNotification {

        /* renamed from: a, reason: collision with root package name */
        public static final b f21596a;

        /* renamed from: b, reason: collision with root package name */
        public static final b f21597b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f21598c;
        public static final b d;
        public static final b e;

        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v3, types: [androidx.transition.b] */
        /* JADX WARN: Type inference failed for: r0v4, types: [androidx.transition.b] */
        static {
            final int i2 = 0;
            f21596a = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i2) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z2);
                            return;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z2);
                            return;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            return;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            return;
                        default:
                            transitionListener.onTransitionResume(transition);
                            return;
                    }
                }
            };
            final int i3 = 1;
            f21597b = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i3) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z2);
                            return;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z2);
                            return;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            return;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            return;
                        default:
                            transitionListener.onTransitionResume(transition);
                            return;
                    }
                }
            };
            final int i4 = 2;
            f21598c = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i4) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z2);
                            return;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z2);
                            return;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            return;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            return;
                        default:
                            transitionListener.onTransitionResume(transition);
                            return;
                    }
                }
            };
            final int i5 = 3;
            d = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i5) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z2);
                            return;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z2);
                            return;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            return;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            return;
                        default:
                            transitionListener.onTransitionResume(transition);
                            return;
                    }
                }
            };
            final int i6 = 4;
            e = new TransitionNotification() { // from class: androidx.transition.b
                @Override // androidx.transition.Transition.TransitionNotification
                public final void a(Transition.TransitionListener transitionListener, Transition transition, boolean z2) {
                    switch (i6) {
                        case 0:
                            transitionListener.onTransitionStart(transition, z2);
                            return;
                        case 1:
                            transitionListener.onTransitionEnd(transition, z2);
                            return;
                        case 2:
                            transitionListener.onTransitionCancel(transition);
                            return;
                        case 3:
                            transitionListener.onTransitionPause(transition);
                            return;
                        default:
                            transitionListener.onTransitionResume(transition);
                            return;
                    }
                }
            };
        }

        void a(TransitionListener transitionListener, Transition transition, boolean z2);
    }

    public static void a(TransitionValuesMaps transitionValuesMaps, View view, TransitionValues transitionValues) {
        transitionValuesMaps.f21620a.put(view, transitionValues);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = transitionValuesMaps.f21621b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String o2 = ViewCompat.o(view);
        if (o2 != null) {
            ArrayMap arrayMap = transitionValuesMaps.d;
            if (arrayMap.containsKey(o2)) {
                arrayMap.put(o2, null);
            } else {
                arrayMap.put(o2, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                LongSparseArray longSparseArray = transitionValuesMaps.f21622c;
                if (longSparseArray.f(itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    longSparseArray.h(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) longSparseArray.c(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    longSparseArray.h(itemIdAtPosition, null);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public static ArrayMap c() {
        ArrayMap<Animator, AnimationInfo> arrayMap = sRunningAnimators.get();
        if (arrayMap != null) {
            return arrayMap;
        }
        ?? simpleArrayMap = new SimpleArrayMap();
        sRunningAnimators.set(simpleArrayMap);
        return simpleArrayMap;
    }

    public static boolean d(TransitionValues transitionValues, TransitionValues transitionValues2, String str) {
        Object obj = transitionValues.f21617a.get(str);
        Object obj2 = transitionValues2.f21617a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    @NonNull
    public Transition addListener(@NonNull TransitionListener transitionListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList<>();
        }
        this.mListeners.add(transitionListener);
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull View view) {
        this.mTargets.add(view);
        return this;
    }

    @RestrictTo
    public void animate(@Nullable Animator animator) {
        if (animator == null) {
            end();
            return;
        }
        if (getDuration() >= 0) {
            animator.setDuration(getDuration());
        }
        if (getStartDelay() >= 0) {
            animator.setStartDelay(animator.getStartDelay() + getStartDelay());
        }
        if (getInterpolator() != null) {
            animator.setInterpolator(getInterpolator());
        }
        animator.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                Transition.this.end();
                animator2.removeListener(this);
            }
        });
        animator.start();
    }

    public final void b(View view, boolean z2) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.mTargetExcludes;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.mTargetTypeExcludes;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.mTargetTypeExcludes.get(i2).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    TransitionValues transitionValues = new TransitionValues(view);
                    if (z2) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.f21619c.add(this);
                    capturePropagationValues(transitionValues);
                    if (z2) {
                        a(this.mStartValues, view, transitionValues);
                    } else {
                        a(this.mEndValues, view, transitionValues);
                    }
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.mTargetIdChildExcludes;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.mTargetChildExcludes;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.mTargetTypeChildExcludes;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i3 = 0; i3 < size2; i3++) {
                                    if (this.mTargetTypeChildExcludes.get(i3).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                                b(viewGroup.getChildAt(i4), z2);
                            }
                        }
                    }
                }
            }
        }
    }

    @RestrictTo
    public void cancel() {
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.cancel();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.f21598c, false);
    }

    public abstract void captureEndValues(TransitionValues transitionValues);

    public void capturePropagationValues(TransitionValues transitionValues) {
        if (this.mPropagation == null || transitionValues.f21617a.isEmpty()) {
            return;
        }
        this.mPropagation.b();
        String[] strArr = VisibilityPropagation.f21646a;
        for (int i2 = 0; i2 < 2; i2++) {
            if (!transitionValues.f21617a.containsKey(strArr[i2])) {
                this.mPropagation.a(transitionValues);
                return;
            }
        }
    }

    public abstract void captureStartValues(TransitionValues transitionValues);

    public void captureValues(@NonNull ViewGroup viewGroup, boolean z2) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        ArrayMap<String, String> arrayMap;
        clearValues(z2);
        if ((this.mTargetIds.size() > 0 || this.mTargets.size() > 0) && (((arrayList = this.mTargetNames) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetTypes) == null || arrayList2.isEmpty()))) {
            for (int i2 = 0; i2 < this.mTargetIds.size(); i2++) {
                View findViewById = viewGroup.findViewById(this.mTargetIds.get(i2).intValue());
                if (findViewById != null) {
                    TransitionValues transitionValues = new TransitionValues(findViewById);
                    if (z2) {
                        captureStartValues(transitionValues);
                    } else {
                        captureEndValues(transitionValues);
                    }
                    transitionValues.f21619c.add(this);
                    capturePropagationValues(transitionValues);
                    if (z2) {
                        a(this.mStartValues, findViewById, transitionValues);
                    } else {
                        a(this.mEndValues, findViewById, transitionValues);
                    }
                }
            }
            for (int i3 = 0; i3 < this.mTargets.size(); i3++) {
                View view = this.mTargets.get(i3);
                TransitionValues transitionValues2 = new TransitionValues(view);
                if (z2) {
                    captureStartValues(transitionValues2);
                } else {
                    captureEndValues(transitionValues2);
                }
                transitionValues2.f21619c.add(this);
                capturePropagationValues(transitionValues2);
                if (z2) {
                    a(this.mStartValues, view, transitionValues2);
                } else {
                    a(this.mEndValues, view, transitionValues2);
                }
            }
        } else {
            b(viewGroup, z2);
        }
        if (z2 || (arrayMap = this.mNameOverrides) == null) {
            return;
        }
        int size = arrayMap.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList3.add((View) this.mStartValues.d.remove((String) this.mNameOverrides.g(i4)));
        }
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = (View) arrayList3.get(i5);
            if (view2 != null) {
                this.mStartValues.d.put((String) this.mNameOverrides.k(i5), view2);
            }
        }
    }

    public void clearValues(boolean z2) {
        if (z2) {
            this.mStartValues.f21620a.clear();
            this.mStartValues.f21621b.clear();
            this.mStartValues.f21622c.a();
        } else {
            this.mEndValues.f21620a.clear();
            this.mEndValues.f21621b.clear();
            this.mEndValues.f21622c.a();
        }
    }

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [androidx.transition.Transition$AnimationInfo, java.lang.Object] */
    public void createAnimators(@NonNull ViewGroup viewGroup, @NonNull TransitionValuesMaps transitionValuesMaps, @NonNull TransitionValuesMaps transitionValuesMaps2, @NonNull ArrayList<TransitionValues> arrayList, @NonNull ArrayList<TransitionValues> arrayList2) {
        Animator createAnimator;
        int i2;
        int i3;
        View view;
        TransitionValues transitionValues;
        Animator animator;
        TransitionValues transitionValues2;
        Animator animator2;
        ArrayMap c2 = c();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z2 = getRootTransition().mSeekController != null;
        long j2 = Long.MAX_VALUE;
        int i4 = 0;
        while (i4 < size) {
            TransitionValues transitionValues3 = arrayList.get(i4);
            TransitionValues transitionValues4 = arrayList2.get(i4);
            if (transitionValues3 != null && !transitionValues3.f21619c.contains(this)) {
                transitionValues3 = null;
            }
            if (transitionValues4 != null && !transitionValues4.f21619c.contains(this)) {
                transitionValues4 = null;
            }
            if (!(transitionValues3 == null && transitionValues4 == null) && ((transitionValues3 == null || transitionValues4 == null || isTransitionRequired(transitionValues3, transitionValues4)) && (createAnimator = createAnimator(viewGroup, transitionValues3, transitionValues4)) != null)) {
                if (transitionValues4 != null) {
                    view = transitionValues4.f21618b;
                    String[] transitionProperties = getTransitionProperties();
                    i2 = size;
                    if (transitionProperties != null && transitionProperties.length > 0) {
                        transitionValues2 = new TransitionValues(view);
                        TransitionValues transitionValues5 = (TransitionValues) transitionValuesMaps2.f21620a.get(view);
                        if (transitionValues5 != null) {
                            animator2 = createAnimator;
                            int i5 = 0;
                            while (i5 < transitionProperties.length) {
                                HashMap hashMap = transitionValues2.f21617a;
                                int i6 = i4;
                                String str = transitionProperties[i5];
                                hashMap.put(str, transitionValues5.f21617a.get(str));
                                i5++;
                                i4 = i6;
                                transitionProperties = transitionProperties;
                            }
                            i3 = i4;
                        } else {
                            i3 = i4;
                            animator2 = createAnimator;
                        }
                        int size2 = c2.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size2) {
                                animator = animator2;
                                break;
                            }
                            AnimationInfo animationInfo = (AnimationInfo) c2.get((Animator) c2.g(i7));
                            if (animationInfo.f21592c != null && animationInfo.f21590a == view && animationInfo.f21591b.equals(getName()) && animationInfo.f21592c.equals(transitionValues2)) {
                                animator = null;
                                break;
                            }
                            i7++;
                        }
                    } else {
                        i3 = i4;
                        animator = createAnimator;
                        transitionValues2 = null;
                    }
                    createAnimator = animator;
                    transitionValues = transitionValues2;
                } else {
                    i2 = size;
                    i3 = i4;
                    view = transitionValues3.f21618b;
                    transitionValues = null;
                }
                if (createAnimator != null) {
                    TransitionPropagation transitionPropagation = this.mPropagation;
                    if (transitionPropagation != null) {
                        long c3 = transitionPropagation.c(viewGroup, this, transitionValues3, transitionValues4);
                        sparseIntArray.put(this.mAnimators.size(), (int) c3);
                        j2 = Math.min(c3, j2);
                    }
                    String name = getName();
                    WindowId windowId = viewGroup.getWindowId();
                    ?? obj = new Object();
                    obj.f21590a = view;
                    obj.f21591b = name;
                    obj.f21592c = transitionValues;
                    obj.d = windowId;
                    obj.e = this;
                    obj.f21593f = createAnimator;
                    if (z2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(createAnimator);
                        createAnimator = animatorSet;
                    }
                    c2.put(createAnimator, obj);
                    this.mAnimators.add(createAnimator);
                }
            } else {
                i2 = size;
                i3 = i4;
            }
            i4 = i3 + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i8 = 0; i8 < sparseIntArray.size(); i8++) {
                AnimationInfo animationInfo2 = (AnimationInfo) c2.get(this.mAnimators.get(sparseIntArray.keyAt(i8)));
                animationInfo2.f21593f.setStartDelay(animationInfo2.f21593f.getStartDelay() + (sparseIntArray.valueAt(i8) - j2));
            }
        }
    }

    @NonNull
    @RequiresApi
    public TransitionSeekController createSeekController() {
        SeekController seekController = new SeekController();
        this.mSeekController = seekController;
        addListener(seekController);
        return this.mSeekController;
    }

    @RestrictTo
    public void end() {
        int i2 = this.mNumInstances - 1;
        this.mNumInstances = i2;
        if (i2 == 0) {
            notifyListeners(TransitionNotification.f21597b, false);
            for (int i3 = 0; i3 < this.mStartValues.f21622c.j(); i3++) {
                View view = (View) this.mStartValues.f21622c.k(i3);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i4 = 0; i4 < this.mEndValues.f21622c.j(); i4++) {
                View view2 = (View) this.mEndValues.f21622c.k(i4);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.mEnded = true;
        }
    }

    @NonNull
    public Transition excludeChildren(@IdRes int i2, boolean z2) {
        ArrayList<Integer> arrayList = this.mTargetIdChildExcludes;
        if (i2 > 0) {
            if (z2) {
                arrayList = ArrayListManager.a(Integer.valueOf(i2), arrayList);
            } else {
                arrayList = ArrayListManager.b(Integer.valueOf(i2), arrayList);
            }
        }
        this.mTargetIdChildExcludes = arrayList;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull String str, boolean z2) {
        ArrayList<String> arrayList = this.mTargetNameExcludes;
        if (str != null) {
            if (z2) {
                arrayList = ArrayListManager.a(str, arrayList);
            } else {
                arrayList = ArrayListManager.b(str, arrayList);
            }
        }
        this.mTargetNameExcludes = arrayList;
        return this;
    }

    public final void f(Transition transition, TransitionNotification transitionNotification, boolean z2) {
        Transition transition2 = this.mCloneParent;
        if (transition2 != null) {
            transition2.f(transition, transitionNotification, z2);
        }
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.mListeners.size();
        TransitionListener[] transitionListenerArr = this.mListenersCache;
        if (transitionListenerArr == null) {
            transitionListenerArr = new TransitionListener[size];
        }
        this.mListenersCache = null;
        TransitionListener[] transitionListenerArr2 = (TransitionListener[]) this.mListeners.toArray(transitionListenerArr);
        for (int i2 = 0; i2 < size; i2++) {
            transitionNotification.a(transitionListenerArr2[i2], transition, z2);
            transitionListenerArr2[i2] = null;
        }
        this.mListenersCache = transitionListenerArr2;
    }

    @RestrictTo
    public void forceToEnd(@Nullable ViewGroup viewGroup) {
        ArrayMap c2 = c();
        int size = c2.size();
        if (viewGroup == null || size == 0) {
            return;
        }
        WindowId windowId = viewGroup.getWindowId();
        SimpleArrayMap simpleArrayMap = new SimpleArrayMap(c2);
        c2.clear();
        for (int i2 = size - 1; i2 >= 0; i2--) {
            AnimationInfo animationInfo = (AnimationInfo) simpleArrayMap.k(i2);
            if (animationInfo.f21590a != null && windowId.equals(animationInfo.d)) {
                ((Animator) simpleArrayMap.g(i2)).end();
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable
    public Rect getEpicenter() {
        EpicenterCallback epicenterCallback = this.mEpicenterCallback;
        if (epicenterCallback == null) {
            return null;
        }
        return epicenterCallback.a();
    }

    @Nullable
    public EpicenterCallback getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable
    public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    public TransitionValues getMatchedTransitionValues(View view, boolean z2) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getMatchedTransitionValues(view, z2);
        }
        ArrayList<TransitionValues> arrayList = z2 ? this.mStartValuesList : this.mEndValuesList;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            }
            TransitionValues transitionValues = arrayList.get(i2);
            if (transitionValues == null) {
                return null;
            }
            if (transitionValues.f21618b == view) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return (z2 ? this.mEndValuesList : this.mStartValuesList).get(i2);
        }
        return null;
    }

    @NonNull
    public String getName() {
        return this.mName;
    }

    @NonNull
    public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable
    public TransitionPropagation getPropagation() {
        return this.mPropagation;
    }

    @NonNull
    public final Transition getRootTransition() {
        TransitionSet transitionSet = this.mParent;
        return transitionSet != null ? transitionSet.getRootTransition() : this;
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull
    public List<Integer> getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable
    public List<String> getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable
    public List<Class<?>> getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull
    public List<View> getTargets() {
        return this.mTargets;
    }

    public final long getTotalDurationMillis() {
        return this.mTotalDuration;
    }

    @Nullable
    public String[] getTransitionProperties() {
        return null;
    }

    @Nullable
    public TransitionValues getTransitionValues(@NonNull View view, boolean z2) {
        TransitionSet transitionSet = this.mParent;
        if (transitionSet != null) {
            return transitionSet.getTransitionValues(view, z2);
        }
        return (TransitionValues) (z2 ? this.mStartValues : this.mEndValues).f21620a.get(view);
    }

    public boolean hasAnimators() {
        return !this.mCurrentAnimators.isEmpty();
    }

    public boolean isSeekingSupported() {
        return false;
    }

    public boolean isTransitionRequired(@Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return false;
        }
        String[] transitionProperties = getTransitionProperties();
        if (transitionProperties == null) {
            Iterator it = transitionValues.f21617a.keySet().iterator();
            while (it.hasNext()) {
                if (d(transitionValues, transitionValues2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : transitionProperties) {
            if (!d(transitionValues, transitionValues2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean isValidTarget(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.mTargetIdExcludes;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.mTargetExcludes;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.mTargetTypeExcludes;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (this.mTargetTypeExcludes.get(i2).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.mTargetNameExcludes != null && ViewCompat.o(view) != null && this.mTargetNameExcludes.contains(ViewCompat.o(view))) {
            return false;
        }
        if ((this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (((arrayList = this.mTargetTypes) == null || arrayList.isEmpty()) && ((arrayList2 = this.mTargetNames) == null || arrayList2.isEmpty()))) || this.mTargetIds.contains(Integer.valueOf(id)) || this.mTargets.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.mTargetNames;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.o(view))) {
            return true;
        }
        if (this.mTargetTypes != null) {
            for (int i3 = 0; i3 < this.mTargetTypes.size(); i3++) {
                if (this.mTargetTypes.get(i3).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void notifyListeners(TransitionNotification transitionNotification, boolean z2) {
        f(this, transitionNotification, z2);
    }

    @RestrictTo
    public void pause(@Nullable View view) {
        if (this.mEnded) {
            return;
        }
        int size = this.mCurrentAnimators.size();
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int i2 = size - 1; i2 >= 0; i2--) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            animator.pause();
        }
        this.mAnimatorCache = animatorArr;
        notifyListeners(TransitionNotification.d, false);
        this.mPaused = true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    public void playTransition(@NonNull ViewGroup viewGroup) {
        AnimationInfo animationInfo;
        View view;
        TransitionValues transitionValues;
        View view2;
        this.mStartValuesList = new ArrayList<>();
        this.mEndValuesList = new ArrayList<>();
        TransitionValuesMaps transitionValuesMaps = this.mStartValues;
        TransitionValuesMaps transitionValuesMaps2 = this.mEndValues;
        ?? simpleArrayMap = new SimpleArrayMap(transitionValuesMaps.f21620a);
        ?? simpleArrayMap2 = new SimpleArrayMap(transitionValuesMaps2.f21620a);
        int i2 = 0;
        while (true) {
            int[] iArr = this.mMatchOrder;
            if (i2 >= iArr.length) {
                break;
            }
            int i3 = iArr[i2];
            if (i3 == 1) {
                for (int i4 = simpleArrayMap.f1608c - 1; i4 >= 0; i4--) {
                    View view3 = (View) simpleArrayMap.g(i4);
                    if (view3 != null && isValidTarget(view3) && (transitionValues = (TransitionValues) simpleArrayMap2.remove(view3)) != null && isValidTarget(transitionValues.f21618b)) {
                        this.mStartValuesList.add((TransitionValues) simpleArrayMap.i(i4));
                        this.mEndValuesList.add(transitionValues);
                    }
                }
            } else if (i3 == 2) {
                ArrayMap arrayMap = transitionValuesMaps.d;
                int size = arrayMap.size();
                for (int i5 = 0; i5 < size; i5++) {
                    View view4 = (View) arrayMap.k(i5);
                    if (view4 != null && isValidTarget(view4)) {
                        View view5 = (View) transitionValuesMaps2.d.get(arrayMap.g(i5));
                        if (view5 != null && isValidTarget(view5)) {
                            TransitionValues transitionValues2 = (TransitionValues) simpleArrayMap.get(view4);
                            TransitionValues transitionValues3 = (TransitionValues) simpleArrayMap2.get(view5);
                            if (transitionValues2 != null && transitionValues3 != null) {
                                this.mStartValuesList.add(transitionValues2);
                                this.mEndValuesList.add(transitionValues3);
                                simpleArrayMap.remove(view4);
                                simpleArrayMap2.remove(view5);
                            }
                        }
                    }
                }
            } else if (i3 == 3) {
                SparseArray sparseArray = transitionValuesMaps.f21621b;
                SparseArray sparseArray2 = transitionValuesMaps2.f21621b;
                int size2 = sparseArray.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    View view6 = (View) sparseArray.valueAt(i6);
                    if (view6 != null && isValidTarget(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i6))) != null && isValidTarget(view2)) {
                        TransitionValues transitionValues4 = (TransitionValues) simpleArrayMap.get(view6);
                        TransitionValues transitionValues5 = (TransitionValues) simpleArrayMap2.get(view2);
                        if (transitionValues4 != null && transitionValues5 != null) {
                            this.mStartValuesList.add(transitionValues4);
                            this.mEndValuesList.add(transitionValues5);
                            simpleArrayMap.remove(view6);
                            simpleArrayMap2.remove(view2);
                        }
                    }
                }
            } else if (i3 == 4) {
                LongSparseArray longSparseArray = transitionValuesMaps.f21622c;
                int j2 = longSparseArray.j();
                for (int i7 = 0; i7 < j2; i7++) {
                    View view7 = (View) longSparseArray.k(i7);
                    if (view7 != null && isValidTarget(view7)) {
                        View view8 = (View) transitionValuesMaps2.f21622c.c(longSparseArray.g(i7));
                        if (view8 != null && isValidTarget(view8)) {
                            TransitionValues transitionValues6 = (TransitionValues) simpleArrayMap.get(view7);
                            TransitionValues transitionValues7 = (TransitionValues) simpleArrayMap2.get(view8);
                            if (transitionValues6 != null && transitionValues7 != null) {
                                this.mStartValuesList.add(transitionValues6);
                                this.mEndValuesList.add(transitionValues7);
                                simpleArrayMap.remove(view7);
                                simpleArrayMap2.remove(view8);
                            }
                        }
                    }
                }
            }
            i2++;
        }
        for (int i8 = 0; i8 < simpleArrayMap.f1608c; i8++) {
            TransitionValues transitionValues8 = (TransitionValues) simpleArrayMap.k(i8);
            if (isValidTarget(transitionValues8.f21618b)) {
                this.mStartValuesList.add(transitionValues8);
                this.mEndValuesList.add(null);
            }
        }
        for (int i9 = 0; i9 < simpleArrayMap2.f1608c; i9++) {
            TransitionValues transitionValues9 = (TransitionValues) simpleArrayMap2.k(i9);
            if (isValidTarget(transitionValues9.f21618b)) {
                this.mEndValuesList.add(transitionValues9);
                this.mStartValuesList.add(null);
            }
        }
        ArrayMap c2 = c();
        int size3 = c2.size();
        WindowId windowId = viewGroup.getWindowId();
        for (int i10 = size3 - 1; i10 >= 0; i10--) {
            Animator animator = (Animator) c2.g(i10);
            if (animator != null && (animationInfo = (AnimationInfo) c2.get(animator)) != null && (view = animationInfo.f21590a) != null && windowId.equals(animationInfo.d)) {
                TransitionValues transitionValues10 = getTransitionValues(view, true);
                TransitionValues matchedTransitionValues = getMatchedTransitionValues(view, true);
                if (transitionValues10 == null && matchedTransitionValues == null) {
                    matchedTransitionValues = (TransitionValues) this.mEndValues.f21620a.get(view);
                }
                if (transitionValues10 != null || matchedTransitionValues != null) {
                    Transition transition = animationInfo.e;
                    if (transition.isTransitionRequired(animationInfo.f21592c, matchedTransitionValues)) {
                        if (transition.getRootTransition().mSeekController != null) {
                            animator.cancel();
                            transition.mCurrentAnimators.remove(animator);
                            c2.remove(animator);
                            if (transition.mCurrentAnimators.size() == 0) {
                                transition.notifyListeners(TransitionNotification.f21598c, false);
                                if (!transition.mEnded) {
                                    transition.mEnded = true;
                                    transition.notifyListeners(TransitionNotification.f21597b, false);
                                }
                            }
                        } else if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            c2.remove(animator);
                        }
                    }
                }
            }
        }
        createAnimators(viewGroup, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        if (this.mSeekController == null) {
            runAnimators();
            return;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            prepareAnimatorsForSeeking();
            SeekController seekController = this.mSeekController;
            Transition transition2 = Transition.this;
            long j3 = transition2.getTotalDurationMillis() == 0 ? 1L : 0L;
            transition2.setCurrentPlayTimeMillis(j3, seekController.f21594a);
            seekController.f21594a = j3;
            this.mSeekController.getClass();
        }
    }

    @RequiresApi
    public void prepareAnimatorsForSeeking() {
        ArrayMap c2 = c();
        this.mTotalDuration = 0L;
        for (int i2 = 0; i2 < this.mAnimators.size(); i2++) {
            Animator animator = this.mAnimators.get(i2);
            AnimationInfo animationInfo = (AnimationInfo) c2.get(animator);
            if (animator != null && animationInfo != null) {
                long duration = getDuration();
                Animator animator2 = animationInfo.f21593f;
                if (duration >= 0) {
                    animator2.setDuration(getDuration());
                }
                if (getStartDelay() >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + getStartDelay());
                }
                if (getInterpolator() != null) {
                    animator2.setInterpolator(getInterpolator());
                }
                this.mCurrentAnimators.add(animator);
                this.mTotalDuration = Math.max(this.mTotalDuration, Impl26.a(animator));
            }
        }
        this.mAnimators.clear();
    }

    @NonNull
    public Transition removeListener(@NonNull TransitionListener transitionListener) {
        Transition transition;
        ArrayList<TransitionListener> arrayList = this.mListeners;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(transitionListener) && (transition = this.mCloneParent) != null) {
            transition.removeListener(transitionListener);
        }
        if (this.mListeners.size() == 0) {
            this.mListeners = null;
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull View view) {
        this.mTargets.remove(view);
        return this;
    }

    @RestrictTo
    public void resume(@Nullable View view) {
        if (this.mPaused) {
            if (!this.mEnded) {
                int size = this.mCurrentAnimators.size();
                Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
                this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
                for (int i2 = size - 1; i2 >= 0; i2--) {
                    Animator animator = animatorArr[i2];
                    animatorArr[i2] = null;
                    animator.resume();
                }
                this.mAnimatorCache = animatorArr;
                notifyListeners(TransitionNotification.e, false);
            }
            this.mPaused = false;
        }
    }

    @RestrictTo
    public void runAnimators() {
        start();
        final ArrayMap c2 = c();
        Iterator<Animator> it = this.mAnimators.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (c2.containsKey(next)) {
                start();
                if (next != null) {
                    next.addListener(new AnimatorListenerAdapter() { // from class: androidx.transition.Transition.2
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            c2.remove(animator);
                            Transition.this.mCurrentAnimators.remove(animator);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            Transition.this.mCurrentAnimators.add(animator);
                        }
                    });
                    animate(next);
                }
            }
        }
        this.mAnimators.clear();
        end();
    }

    public void setCanRemoveViews(boolean z2) {
        this.mCanRemoveViews = z2;
    }

    @RequiresApi
    public void setCurrentPlayTimeMillis(long j2, long j3) {
        long totalDurationMillis = getTotalDurationMillis();
        int i2 = 0;
        boolean z2 = j2 < j3;
        int i3 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if ((i3 < 0 && j2 >= 0) || (j3 > totalDurationMillis && j2 <= totalDurationMillis)) {
            this.mEnded = false;
            notifyListeners(TransitionNotification.f21596a, z2);
        }
        Animator[] animatorArr = (Animator[]) this.mCurrentAnimators.toArray(this.mAnimatorCache);
        this.mAnimatorCache = EMPTY_ANIMATOR_ARRAY;
        for (int size = this.mCurrentAnimators.size(); i2 < size; size = size) {
            Animator animator = animatorArr[i2];
            animatorArr[i2] = null;
            Impl26.b(animator, Math.min(Math.max(0L, j2), Impl26.a(animator)));
            i2++;
            i3 = i3;
        }
        int i4 = i3;
        this.mAnimatorCache = animatorArr;
        if ((j2 <= totalDurationMillis || j3 > totalDurationMillis) && (j2 >= 0 || i4 < 0)) {
            return;
        }
        if (j2 > totalDurationMillis) {
            this.mEnded = true;
        }
        notifyListeners(TransitionNotification.f21597b, z2);
    }

    @NonNull
    public Transition setDuration(long j2) {
        this.mDuration = j2;
        return this;
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback epicenterCallback) {
        this.mEpicenterCallback = epicenterCallback;
    }

    @NonNull
    public Transition setInterpolator(@Nullable TimeInterpolator timeInterpolator) {
        this.mInterpolator = timeInterpolator;
        return this;
    }

    public void setMatchOrder(@Nullable int... iArr) {
        if (iArr == null || iArr.length == 0) {
            this.mMatchOrder = DEFAULT_MATCH_ORDER;
            return;
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 < 1 || i3 > 4) {
                throw new IllegalArgumentException("matches contains invalid value");
            }
            for (int i4 = 0; i4 < i2; i4++) {
                if (iArr[i4] == i3) {
                    throw new IllegalArgumentException("matches contains a duplicate value");
                }
            }
        }
        this.mMatchOrder = (int[]) iArr.clone();
    }

    public void setPathMotion(@Nullable PathMotion pathMotion) {
        if (pathMotion == null) {
            this.mPathMotion = STRAIGHT_PATH_MOTION;
        } else {
            this.mPathMotion = pathMotion;
        }
    }

    public void setPropagation(@Nullable TransitionPropagation transitionPropagation) {
        this.mPropagation = transitionPropagation;
    }

    @NonNull
    public Transition setStartDelay(long j2) {
        this.mStartDelay = j2;
        return this;
    }

    @RestrictTo
    public void start() {
        if (this.mNumInstances == 0) {
            notifyListeners(TransitionNotification.f21596a, false);
            this.mEnded = false;
        }
        this.mNumInstances++;
    }

    @NonNull
    public String toString() {
        return toString("");
    }

    @NonNull
    public Transition addTarget(@IdRes int i2) {
        if (i2 != 0) {
            this.mTargetIds.add(Integer.valueOf(i2));
        }
        return this;
    }

    @Override // 
    @NonNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Transition mo7clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.mAnimators = new ArrayList<>();
            transition.mStartValues = new TransitionValuesMaps();
            transition.mEndValues = new TransitionValuesMaps();
            transition.mStartValuesList = null;
            transition.mEndValuesList = null;
            transition.mSeekController = null;
            transition.mCloneParent = this;
            transition.mListeners = null;
            return transition;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    public Transition removeTarget(@IdRes int i2) {
        if (i2 != 0) {
            this.mTargetIds.remove(Integer.valueOf(i2));
        }
        return this;
    }

    public String toString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.mDuration != -1) {
            sb.append("dur(");
            sb.append(this.mDuration);
            sb.append(") ");
        }
        if (this.mStartDelay != -1) {
            sb.append("dly(");
            sb.append(this.mStartDelay);
            sb.append(") ");
        }
        if (this.mInterpolator != null) {
            sb.append("interp(");
            sb.append(this.mInterpolator);
            sb.append(") ");
        }
        if (this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            sb.append("tgts(");
            if (this.mTargetIds.size() > 0) {
                for (int i2 = 0; i2 < this.mTargetIds.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargetIds.get(i2));
                }
            }
            if (this.mTargets.size() > 0) {
                for (int i3 = 0; i3 < this.mTargets.size(); i3++) {
                    if (i3 > 0) {
                        sb.append(", ");
                    }
                    sb.append(this.mTargets.get(i3));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    @NonNull
    public Transition addTarget(@NonNull String str) {
        if (this.mTargetNames == null) {
            this.mTargetNames = new ArrayList<>();
        }
        this.mTargetNames.add(str);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull View view, boolean z2) {
        ArrayList<View> arrayList = this.mTargetChildExcludes;
        if (view != null) {
            if (z2) {
                arrayList = ArrayListManager.a(view, arrayList);
            } else {
                arrayList = ArrayListManager.b(view, arrayList);
            }
        }
        this.mTargetChildExcludes = arrayList;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@IdRes int i2, boolean z2) {
        ArrayList<Integer> arrayList = this.mTargetIdExcludes;
        if (i2 > 0) {
            if (z2) {
                arrayList = ArrayListManager.a(Integer.valueOf(i2), arrayList);
            } else {
                arrayList = ArrayListManager.b(Integer.valueOf(i2), arrayList);
            }
        }
        this.mTargetIdExcludes = arrayList;
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull String str) {
        ArrayList<String> arrayList = this.mTargetNames;
        if (arrayList != null) {
            arrayList.remove(str);
        }
        return this;
    }

    @NonNull
    public Transition removeTarget(@NonNull Class<?> cls) {
        ArrayList<Class<?>> arrayList = this.mTargetTypes;
        if (arrayList != null) {
            arrayList.remove(cls);
        }
        return this;
    }

    @NonNull
    public Transition addTarget(@NonNull Class<?> cls) {
        if (this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList<>();
        }
        this.mTargetTypes.add(cls);
        return this;
    }

    @NonNull
    public Transition excludeChildren(@NonNull Class<?> cls, boolean z2) {
        ArrayList<Class<?>> arrayList = this.mTargetTypeChildExcludes;
        if (cls != null) {
            if (z2) {
                arrayList = ArrayListManager.a(cls, arrayList);
            } else {
                arrayList = ArrayListManager.b(cls, arrayList);
            }
        }
        this.mTargetTypeChildExcludes = arrayList;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull View view, boolean z2) {
        ArrayList<View> arrayList = this.mTargetExcludes;
        if (view != null) {
            if (z2) {
                arrayList = ArrayListManager.a(view, arrayList);
            } else {
                arrayList = ArrayListManager.b(view, arrayList);
            }
        }
        this.mTargetExcludes = arrayList;
        return this;
    }

    @NonNull
    public Transition excludeTarget(@NonNull Class<?> cls, boolean z2) {
        ArrayList<Class<?>> arrayList = this.mTargetTypeExcludes;
        if (cls != null) {
            if (z2) {
                arrayList = ArrayListManager.a(cls, arrayList);
            } else {
                arrayList = ArrayListManager.b(cls, arrayList);
            }
        }
        this.mTargetTypeExcludes = arrayList;
        return this;
    }
}
