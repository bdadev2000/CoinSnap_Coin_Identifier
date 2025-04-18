package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import com.cooldev.gba.emulator.gameboy.R;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public class MotionScene {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f17849a;

    /* renamed from: b, reason: collision with root package name */
    public final StateSet f17850b;

    /* renamed from: c, reason: collision with root package name */
    public Transition f17851c;
    public final ArrayList d;
    public final Transition e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f17852f;

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f17853g;

    /* renamed from: h, reason: collision with root package name */
    public final HashMap f17854h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseIntArray f17855i;

    /* renamed from: j, reason: collision with root package name */
    public int f17856j;

    /* renamed from: k, reason: collision with root package name */
    public int f17857k;

    /* renamed from: l, reason: collision with root package name */
    public MotionEvent f17858l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f17859m;

    /* renamed from: n, reason: collision with root package name */
    public MotionLayout.MotionTracker f17860n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17861o;

    /* renamed from: p, reason: collision with root package name */
    public float f17862p;

    /* renamed from: q, reason: collision with root package name */
    public float f17863q;

    public MotionScene(Context context, MotionLayout motionLayout, int i2) {
        int eventType;
        Transition transition = null;
        this.f17850b = null;
        this.f17851c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f17852f = new ArrayList();
        this.f17853g = new SparseArray();
        this.f17854h = new HashMap();
        this.f17855i = new SparseIntArray();
        this.f17856j = 400;
        this.f17857k = 0;
        this.f17859m = false;
        this.f17849a = motionLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            eventType = xml.getEventType();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f17853g.put(R.id.motion_base, new ConstraintSet());
                this.f17854h.put("motion_base", Integer.valueOf(R.id.motion_base));
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c2 = 5;
                            break;
                        }
                        break;
                    case -1239391468:
                        if (name.equals("KeyFrameSet")) {
                            c2 = 6;
                            break;
                        }
                        break;
                    case 269306229:
                        if (name.equals("Transition")) {
                            break;
                        }
                        break;
                    case 312750793:
                        if (name.equals("OnClick")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 327855227:
                        if (name.equals("OnSwipe")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 793277014:
                        if (name.equals("MotionScene")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                c2 = 65535;
                switch (c2) {
                    case 0:
                        g(context, xml);
                        break;
                    case 1:
                        transition = new Transition(this, context, xml);
                        arrayList.add(transition);
                        if (this.f17851c == null && !transition.f17866b) {
                            this.f17851c = transition;
                            TouchResponse touchResponse = transition.f17874l;
                            if (touchResponse != null) {
                                touchResponse.b(this.f17861o);
                            }
                        }
                        if (!transition.f17866b) {
                            break;
                        } else {
                            if (transition.f17867c == -1) {
                                this.e = transition;
                            } else {
                                this.f17852f.add(transition);
                            }
                            arrayList.remove(transition);
                            break;
                        }
                        break;
                    case 2:
                        if (transition == null) {
                            Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i2) + ".xml:" + xml.getLineNumber() + ")");
                        }
                        transition.f17874l = new TouchResponse(context, this.f17849a, xml);
                        break;
                    case 3:
                        transition.getClass();
                        transition.f17875m.add(new Transition.TransitionOnClick(context, transition, xml));
                        break;
                    case 4:
                        this.f17850b = new StateSet(context, xml);
                        break;
                    case 5:
                        f(context, xml);
                        break;
                    case 6:
                        transition.f17873k.add(new KeyFrames(context, xml));
                        break;
                    default:
                        Log.v("MotionScene", "WARNING UNKNOWN ATTRIBUTE " + name);
                        break;
                }
            }
            eventType = xml.next();
        }
    }

    public final boolean a(MotionLayout motionLayout, int i2) {
        if (this.f17860n != null) {
            return false;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Transition transition = (Transition) it.next();
            int i3 = transition.f17876n;
            if (i3 != 0) {
                int i4 = transition.d;
                MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.f17848c;
                MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.f17847b;
                MotionLayout.TransitionState transitionState3 = MotionLayout.TransitionState.f17846a;
                if (i2 == i4 && (i3 == 4 || i3 == 2)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition);
                    if (transition.f17876n == 4) {
                        motionLayout.b(1.0f);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.c(true);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        motionLayout.setState(transitionState);
                    }
                    return true;
                }
                if (i2 == transition.f17867c && (i3 == 3 || i3 == 1)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition);
                    if (transition.f17876n == 3) {
                        motionLayout.b(0.0f);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.c(true);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        motionLayout.setState(transitionState);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final ConstraintSet b(int i2) {
        int b2;
        StateSet stateSet = this.f17850b;
        if (stateSet != null && (b2 = stateSet.b(i2)) != -1) {
            i2 = b2;
        }
        SparseArray sparseArray = this.f17853g;
        if (sparseArray.get(i2) != null) {
            return (ConstraintSet) sparseArray.get(i2);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.a(i2, this.f17849a.getContext()) + " In MotionScene");
        return (ConstraintSet) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c(Context context, String str) {
        int i2;
        if (str.contains(RemoteSettings.FORWARD_SLASH_STRING)) {
            i2 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            i2 = -1;
        }
        if (i2 != -1) {
            return i2;
        }
        if (str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i2;
    }

    public final Interpolator d() {
        Transition transition = this.f17851c;
        int i2 = transition.e;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.f17849a.getContext(), this.f17851c.f17869g);
        }
        if (i2 == -1) {
            final Easing b2 = Easing.b(transition.f17868f);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f2) {
                    return (float) Easing.this.a(f2);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new AnticipateInterpolator();
        }
        if (i2 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public final float e() {
        TouchResponse touchResponse;
        Transition transition = this.f17851c;
        if (transition == null || (touchResponse = transition.f17874l) == null) {
            return 0.0f;
        }
        return touchResponse.f17897o;
    }

    public final void f(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.f18249b = false;
        int attributeCount = xmlResourceParser.getAttributeCount();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < attributeCount; i4++) {
            String attributeName = xmlResourceParser.getAttributeName(i4);
            String attributeValue = xmlResourceParser.getAttributeValue(i4);
            attributeName.getClass();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i3 = c(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i2 = c(context, attributeValue);
                int indexOf = attributeValue.indexOf(47);
                if (indexOf >= 0) {
                    attributeValue = attributeValue.substring(indexOf + 1);
                }
                this.f17854h.put(attributeValue, Integer.valueOf(i2));
            }
        }
        if (i2 != -1) {
            int i5 = this.f17849a.f17835t;
            constraintSet.i(context, xmlResourceParser);
            if (i3 != -1) {
                this.f17855i.put(i2, i3);
            }
            this.f17853g.put(i2, constraintSet);
        }
    }

    public final void g(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.f18335l);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f17856j = obtainStyledAttributes.getInt(index, this.f17856j);
            } else if (index == 1) {
                this.f17857k = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final void h(int i2) {
        SparseIntArray sparseIntArray = this.f17855i;
        int i3 = sparseIntArray.get(i2);
        if (i3 > 0) {
            h(sparseIntArray.get(i2));
            SparseArray sparseArray = this.f17853g;
            ConstraintSet constraintSet = (ConstraintSet) sparseArray.get(i2);
            ConstraintSet constraintSet2 = (ConstraintSet) sparseArray.get(i3);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.a(i3, this.f17849a.getContext()));
                return;
            }
            constraintSet.getClass();
            HashMap hashMap = constraintSet2.f18250c;
            for (Integer num : hashMap.keySet()) {
                int intValue = num.intValue();
                ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) hashMap.get(num);
                HashMap hashMap2 = constraintSet.f18250c;
                if (!hashMap2.containsKey(Integer.valueOf(intValue))) {
                    hashMap2.put(Integer.valueOf(intValue), new ConstraintSet.Constraint());
                }
                ConstraintSet.Constraint constraint2 = (ConstraintSet.Constraint) hashMap2.get(Integer.valueOf(intValue));
                ConstraintSet.Layout layout = constraint2.d;
                if (!layout.f18258b) {
                    layout.a(constraint.d);
                }
                ConstraintSet.PropertySet propertySet = constraint2.f18252b;
                if (!propertySet.f18294a) {
                    ConstraintSet.PropertySet propertySet2 = constraint.f18252b;
                    propertySet.f18294a = propertySet2.f18294a;
                    propertySet.f18295b = propertySet2.f18295b;
                    propertySet.d = propertySet2.d;
                    propertySet.e = propertySet2.e;
                    propertySet.f18296c = propertySet2.f18296c;
                }
                ConstraintSet.Transform transform = constraint2.e;
                if (!transform.f18298a) {
                    transform.a(constraint.e);
                }
                ConstraintSet.Motion motion = constraint2.f18253c;
                if (!motion.f18289a) {
                    motion.a(constraint.f18253c);
                }
                for (String str : constraint.f18254f.keySet()) {
                    if (!constraint2.f18254f.containsKey(str)) {
                        constraint2.f18254f.put(str, constraint.f18254f.get(str));
                    }
                }
            }
            sparseIntArray.put(i2, -1);
        }
    }

    public final void i(MotionLayout motionLayout) {
        int i2 = 0;
        loop0: while (true) {
            SparseArray sparseArray = this.f17853g;
            if (i2 >= sparseArray.size()) {
                for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                    ConstraintSet constraintSet = (ConstraintSet) sparseArray.valueAt(i3);
                    constraintSet.getClass();
                    int childCount = motionLayout.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = motionLayout.getChildAt(i4);
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        int id = childAt.getId();
                        if (constraintSet.f18249b && id == -1) {
                            throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                        }
                        HashMap hashMap = constraintSet.f18250c;
                        if (!hashMap.containsKey(Integer.valueOf(id))) {
                            hashMap.put(Integer.valueOf(id), new ConstraintSet.Constraint());
                        }
                        ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) hashMap.get(Integer.valueOf(id));
                        if (!constraint.d.f18258b) {
                            constraint.b(id, layoutParams);
                            boolean z2 = childAt instanceof ConstraintHelper;
                            ConstraintSet.Layout layout = constraint.d;
                            if (z2) {
                                layout.f18263e0 = ((ConstraintHelper) childAt).getReferencedIds();
                                if (childAt instanceof Barrier) {
                                    Barrier barrier = (Barrier) childAt;
                                    layout.f18273j0 = barrier.f18178k.f17980i0;
                                    layout.f18259b0 = barrier.getType();
                                    layout.f18261c0 = barrier.getMargin();
                                }
                            }
                            layout.f18258b = true;
                        }
                        ConstraintSet.PropertySet propertySet = constraint.f18252b;
                        if (!propertySet.f18294a) {
                            propertySet.f18295b = childAt.getVisibility();
                            propertySet.d = childAt.getAlpha();
                            propertySet.f18294a = true;
                        }
                        ConstraintSet.Transform transform = constraint.e;
                        if (!transform.f18298a) {
                            transform.f18298a = true;
                            transform.f18299b = childAt.getRotation();
                            transform.f18300c = childAt.getRotationX();
                            transform.d = childAt.getRotationY();
                            transform.e = childAt.getScaleX();
                            transform.f18301f = childAt.getScaleY();
                            float pivotX = childAt.getPivotX();
                            float pivotY = childAt.getPivotY();
                            if (pivotX != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || pivotY != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                transform.f18302g = pivotX;
                                transform.f18303h = pivotY;
                            }
                            transform.f18304i = childAt.getTranslationX();
                            transform.f18305j = childAt.getTranslationY();
                            transform.f18306k = childAt.getTranslationZ();
                            if (transform.f18307l) {
                                transform.f18308m = childAt.getElevation();
                            }
                        }
                    }
                }
                return;
            }
            int keyAt = sparseArray.keyAt(i2);
            SparseIntArray sparseIntArray = this.f17855i;
            int i5 = sparseIntArray.get(keyAt);
            int size = sparseIntArray.size();
            while (i5 > 0) {
                if (i5 == keyAt) {
                    break loop0;
                }
                int i6 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i5 = sparseIntArray.get(i5);
                size = i6;
            }
            h(keyAt);
            i2++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r2 != (-1)) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r9, int r10) {
        /*
            r8 = this;
            androidx.constraintlayout.widget.StateSet r0 = r8.f17850b
            r1 = -1
            if (r0 == 0) goto L18
            int r0 = r0.b(r9)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r9
        Ld:
            androidx.constraintlayout.widget.StateSet r2 = r8.f17850b
            int r2 = r2.b(r10)
            if (r2 == r1) goto L16
            goto L1a
        L16:
            r2 = r10
            goto L1a
        L18:
            r0 = r9
            goto L16
        L1a:
            java.util.ArrayList r3 = r8.d
            java.util.Iterator r4 = r3.iterator()
        L20:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r5
            int r6 = r5.f17867c
            if (r6 != r2) goto L34
            int r7 = r5.d
            if (r7 == r0) goto L3a
        L34:
            if (r6 != r10) goto L20
            int r6 = r5.d
            if (r6 != r9) goto L20
        L3a:
            r8.f17851c = r5
            androidx.constraintlayout.motion.widget.TouchResponse r9 = r5.f17874l
            if (r9 == 0) goto L45
            boolean r10 = r8.f17861o
            r9.b(r10)
        L45:
            return
        L46:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r9 = r8.e
            java.util.ArrayList r4 = r8.f17852f
            java.util.Iterator r4 = r4.iterator()
        L4e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L60
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r5
            int r6 = r5.f17867c
            if (r6 != r10) goto L4e
            r9 = r5
            goto L4e
        L60:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r10 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r10.<init>(r8, r9)
            r10.d = r0
            r10.f17867c = r2
            if (r0 == r1) goto L6e
            r3.add(r10)
        L6e:
            r8.f17851c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.j(int, int):void");
    }

    public final boolean k() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((Transition) it.next()).f17874l != null) {
                return true;
            }
        }
        Transition transition = this.f17851c;
        return (transition == null || transition.f17874l == null) ? false : true;
    }

    /* loaded from: classes3.dex */
    public static class Transition {

        /* renamed from: a, reason: collision with root package name */
        public final int f17865a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f17866b;

        /* renamed from: c, reason: collision with root package name */
        public int f17867c;
        public int d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final String f17868f;

        /* renamed from: g, reason: collision with root package name */
        public final int f17869g;

        /* renamed from: h, reason: collision with root package name */
        public int f17870h;

        /* renamed from: i, reason: collision with root package name */
        public final float f17871i;

        /* renamed from: j, reason: collision with root package name */
        public final MotionScene f17872j;

        /* renamed from: k, reason: collision with root package name */
        public final ArrayList f17873k;

        /* renamed from: l, reason: collision with root package name */
        public TouchResponse f17874l;

        /* renamed from: m, reason: collision with root package name */
        public final ArrayList f17875m;

        /* renamed from: n, reason: collision with root package name */
        public final int f17876n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f17877o;

        /* renamed from: p, reason: collision with root package name */
        public final int f17878p;

        /* renamed from: q, reason: collision with root package name */
        public final int f17879q;

        /* loaded from: classes3.dex */
        public static class TransitionOnClick implements View.OnClickListener {

            /* renamed from: a, reason: collision with root package name */
            public final Transition f17880a;

            /* renamed from: b, reason: collision with root package name */
            public final int f17881b;

            /* renamed from: c, reason: collision with root package name */
            public final int f17882c;

            public TransitionOnClick(Context context, Transition transition, XmlResourceParser xmlResourceParser) {
                this.f17881b = -1;
                this.f17882c = 17;
                this.f17880a = transition;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.f18336m);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = obtainStyledAttributes.getIndex(i2);
                    if (index == 1) {
                        this.f17881b = obtainStyledAttributes.getResourceId(index, this.f17881b);
                    } else if (index == 0) {
                        this.f17882c = obtainStyledAttributes.getInt(index, this.f17882c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
            public final void a(MotionLayout motionLayout, int i2, Transition transition) {
                int i3 = this.f17881b;
                MotionLayout motionLayout2 = motionLayout;
                if (i3 != -1) {
                    motionLayout2 = motionLayout.findViewById(i3);
                }
                if (motionLayout2 == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i3);
                    return;
                }
                int i4 = transition.d;
                int i5 = transition.f17867c;
                if (i4 == -1) {
                    motionLayout2.setOnClickListener(this);
                    return;
                }
                int i6 = this.f17882c;
                int i7 = i6 & 1;
                if (((i7 != 0 && i2 == i4) | (i7 != 0 && i2 == i4) | ((i6 & 256) != 0 && i2 == i4) | ((i6 & 16) != 0 && i2 == i5)) || ((i6 & 4096) != 0 && i2 == i5)) {
                    motionLayout2.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i2 = this.f17881b;
                if (i2 == -1) {
                    return;
                }
                View findViewById = motionLayout.findViewById(i2);
                if (findViewById != null) {
                    findViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i2);
            }

            /* JADX WARN: Removed duplicated region for block: B:33:0x0071  */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void onClick(android.view.View r13) {
                /*
                    r12 = this;
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r13 = r12.f17880a
                    androidx.constraintlayout.motion.widget.MotionScene r0 = r13.f17872j
                    androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.f17849a
                    boolean r2 = r1.f17825j
                    if (r2 != 0) goto Lb
                    return
                Lb:
                    int r2 = r13.d
                    r3 = 1065353216(0x3f800000, float:1.0)
                    r4 = -1
                    if (r2 != r4) goto L32
                    int r0 = r1.getCurrentState()
                    if (r0 != r4) goto L1e
                    int r13 = r13.f17867c
                    r1.h(r13)
                    return
                L1e:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r2 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
                    androidx.constraintlayout.motion.widget.MotionScene r4 = r13.f17872j
                    r2.<init>(r4, r13)
                    r2.d = r0
                    int r13 = r13.f17867c
                    r2.f17867c = r13
                    r1.setTransition(r2)
                    r1.b(r3)
                    return
                L32:
                    androidx.constraintlayout.motion.widget.MotionScene$Transition r0 = r0.f17851c
                    int r2 = r12.f17882c
                    r5 = r2 & 1
                    r6 = 1
                    r7 = 0
                    if (r5 != 0) goto L43
                    r8 = r2 & 256(0x100, float:3.59E-43)
                    if (r8 == 0) goto L41
                    goto L43
                L41:
                    r8 = r7
                    goto L44
                L43:
                    r8 = r6
                L44:
                    r9 = r2 & 16
                    if (r9 != 0) goto L4e
                    r10 = r2 & 4096(0x1000, float:5.74E-42)
                    if (r10 == 0) goto L4d
                    goto L4e
                L4d:
                    r6 = r7
                L4e:
                    if (r8 == 0) goto L6d
                    if (r6 == 0) goto L6d
                    if (r0 == r13) goto L57
                    r1.setTransition(r13)
                L57:
                    int r10 = r1.getCurrentState()
                    int r11 = r1.getEndState()
                    if (r10 == r11) goto L6e
                    float r10 = r1.getProgress()
                    r11 = 1056964608(0x3f000000, float:0.5)
                    int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
                    if (r10 <= 0) goto L6c
                    goto L6e
                L6c:
                    r6 = r7
                L6d:
                    r7 = r8
                L6e:
                    if (r13 != r0) goto L71
                    goto L82
                L71:
                    int r0 = r13.f17867c
                    int r8 = r13.d
                    if (r8 != r4) goto L7c
                    int r4 = r1.f17821f
                    if (r4 == r0) goto Lb2
                    goto L82
                L7c:
                    int r4 = r1.f17821f
                    if (r4 == r8) goto L82
                    if (r4 != r0) goto Lb2
                L82:
                    if (r7 == 0) goto L8d
                    if (r5 == 0) goto L8d
                    r1.setTransition(r13)
                    r1.b(r3)
                    goto Lb2
                L8d:
                    r0 = 0
                    if (r6 == 0) goto L99
                    if (r9 == 0) goto L99
                    r1.setTransition(r13)
                    r1.b(r0)
                    goto Lb2
                L99:
                    if (r7 == 0) goto La6
                    r4 = r2 & 256(0x100, float:3.59E-43)
                    if (r4 == 0) goto La6
                    r1.setTransition(r13)
                    r1.setProgress(r3)
                    goto Lb2
                La6:
                    if (r6 == 0) goto Lb2
                    r2 = r2 & 4096(0x1000, float:5.74E-42)
                    if (r2 == 0) goto Lb2
                    r1.setTransition(r13)
                    r1.setProgress(r0)
                Lb2:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.Transition.TransitionOnClick.onClick(android.view.View):void");
            }
        }

        public Transition(MotionScene motionScene, Transition transition) {
            this.f17865a = -1;
            this.f17866b = false;
            this.f17867c = -1;
            this.d = -1;
            this.e = 0;
            this.f17868f = null;
            this.f17869g = -1;
            this.f17870h = 400;
            this.f17871i = 0.0f;
            this.f17873k = new ArrayList();
            this.f17874l = null;
            this.f17875m = new ArrayList();
            this.f17876n = 0;
            this.f17877o = false;
            this.f17878p = 0;
            this.f17879q = 0;
            this.f17872j = motionScene;
            if (transition != null) {
                this.e = transition.e;
                this.f17868f = transition.f17868f;
                this.f17869g = transition.f17869g;
                this.f17870h = transition.f17870h;
                this.f17873k = transition.f17873k;
                this.f17871i = transition.f17871i;
                this.f17878p = transition.f17878p;
            }
        }

        public Transition(MotionScene motionScene, Context context, XmlResourceParser xmlResourceParser) {
            this.f17865a = -1;
            this.f17866b = false;
            this.f17867c = -1;
            this.d = -1;
            this.e = 0;
            this.f17868f = null;
            this.f17869g = -1;
            this.f17870h = 400;
            this.f17871i = 0.0f;
            this.f17873k = new ArrayList();
            this.f17874l = null;
            this.f17875m = new ArrayList();
            this.f17876n = 0;
            this.f17877o = false;
            this.f17878p = 0;
            this.f17879q = 0;
            this.f17870h = motionScene.f17856j;
            this.f17878p = motionScene.f17857k;
            this.f17872j = motionScene;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.f18342s);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                SparseArray sparseArray = motionScene.f17853g;
                if (index == 2) {
                    this.f17867c = obtainStyledAttributes.getResourceId(index, this.f17867c);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.f17867c))) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.h(this.f17867c, context);
                        sparseArray.append(this.f17867c, constraintSet);
                    }
                } else if (index == 3) {
                    this.d = obtainStyledAttributes.getResourceId(index, this.d);
                    if ("layout".equals(context.getResources().getResourceTypeName(this.d))) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.h(this.d, context);
                        sparseArray.append(this.d, constraintSet2);
                    }
                } else if (index == 6) {
                    int i3 = obtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                        this.f17869g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i3 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f17868f = string;
                        if (string.indexOf(RemoteSettings.FORWARD_SLASH_STRING) > 0) {
                            this.f17869g = obtainStyledAttributes.getResourceId(index, -1);
                            this.e = -2;
                        } else {
                            this.e = -1;
                        }
                    } else {
                        this.e = obtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == 4) {
                    this.f17870h = obtainStyledAttributes.getInt(index, this.f17870h);
                } else if (index == 8) {
                    this.f17871i = obtainStyledAttributes.getFloat(index, this.f17871i);
                } else if (index == 1) {
                    this.f17876n = obtainStyledAttributes.getInteger(index, this.f17876n);
                } else if (index == 0) {
                    this.f17865a = obtainStyledAttributes.getResourceId(index, this.f17865a);
                } else if (index == 9) {
                    this.f17877o = obtainStyledAttributes.getBoolean(index, this.f17877o);
                } else if (index == 7) {
                    obtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.f17878p = obtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.f17879q = obtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.f17866b = true;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
