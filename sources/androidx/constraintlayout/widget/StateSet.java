package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class StateSet {

    /* renamed from: a, reason: collision with root package name */
    public final int f18344a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f18345b = new SparseArray();

    /* loaded from: classes2.dex */
    public static class State {

        /* renamed from: a, reason: collision with root package name */
        public final int f18346a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f18347b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final int f18348c;

        public State(Context context, XmlResourceParser xmlResourceParser) {
            this.f18348c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f18339p);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f18346a = obtainStyledAttributes.getResourceId(index, this.f18346a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f18348c);
                    this.f18348c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes2.dex */
    public static class Variant {

        /* renamed from: a, reason: collision with root package name */
        public final float f18349a;

        /* renamed from: b, reason: collision with root package name */
        public final float f18350b;

        /* renamed from: c, reason: collision with root package name */
        public final float f18351c;
        public final float d;
        public final int e;

        public Variant(Context context, XmlResourceParser xmlResourceParser) {
            this.f18349a = Float.NaN;
            this.f18350b = Float.NaN;
            this.f18351c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f18343t);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f18350b = obtainStyledAttributes.getDimension(index, this.f18350b);
                } else if (index == 3) {
                    this.f18351c = obtainStyledAttributes.getDimension(index, this.f18351c);
                } else if (index == 4) {
                    this.f18349a = obtainStyledAttributes.getDimension(index, this.f18349a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f2, float f3) {
            float f4 = this.f18349a;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f18350b;
            if (!Float.isNaN(f5) && f3 < f5) {
                return false;
            }
            float f6 = this.f18351c;
            if (!Float.isNaN(f6) && f2 > f6) {
                return false;
            }
            float f7 = this.d;
            return Float.isNaN(f7) || f3 <= f7;
        }
    }

    public StateSet(Context context, XmlResourceParser xmlResourceParser) {
        char c2;
        this.f18344a = -1;
        new SparseArray();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f18340q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 0) {
                this.f18344a = obtainStyledAttributes.getResourceId(index, this.f18344a);
            }
        }
        try {
            int eventType = xmlResourceParser.getEventType();
            State state = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c2 = 3;
                                break;
                            }
                            break;
                    }
                    c2 = 65535;
                    if (c2 != 0 && c2 != 1) {
                        if (c2 == 2) {
                            state = new State(context, xmlResourceParser);
                            this.f18345b.put(state.f18346a, state);
                        } else if (c2 != 3) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            Variant variant = new Variant(context, xmlResourceParser);
                            if (state != null) {
                                state.f18347b.add(variant);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final int a(float f2, float f3, int i2, int i3) {
        State state = (State) this.f18345b.get(i3);
        if (state == null) {
            return i3;
        }
        ArrayList arrayList = state.f18347b;
        int i4 = state.f18348c;
        if (f2 == -1.0f || f3 == -1.0f) {
            if (i4 == i2) {
                return i2;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (i2 == ((Variant) it.next()).e) {
                    return i2;
                }
            }
            return i4;
        }
        Iterator it2 = arrayList.iterator();
        Variant variant = null;
        while (it2.hasNext()) {
            Variant variant2 = (Variant) it2.next();
            if (variant2.a(f2, f3)) {
                if (i2 == variant2.e) {
                    return i2;
                }
                variant = variant2;
            }
        }
        return variant != null ? variant.e : i4;
    }

    public final int b(int i2) {
        int i3;
        float f2 = -1;
        SparseArray sparseArray = this.f18345b;
        int i4 = 0;
        if (-1 == i2) {
            State state = i2 == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(-1);
            if (state == null) {
                return -1;
            }
            while (true) {
                ArrayList arrayList = state.f18347b;
                if (i4 >= arrayList.size()) {
                    i4 = -1;
                    break;
                }
                if (((Variant) arrayList.get(i4)).a(f2, f2)) {
                    break;
                }
                i4++;
            }
            if (-1 == i4) {
                return -1;
            }
            i3 = i4 == -1 ? state.f18348c : ((Variant) state.f18347b.get(i4)).e;
        } else {
            State state2 = (State) sparseArray.get(i2);
            if (state2 == null) {
                return -1;
            }
            while (true) {
                ArrayList arrayList2 = state2.f18347b;
                if (i4 >= arrayList2.size()) {
                    i4 = -1;
                    break;
                }
                if (((Variant) arrayList2.get(i4)).a(f2, f2)) {
                    break;
                }
                i4++;
            }
            i3 = i4 == -1 ? state2.f18348c : ((Variant) state2.f18347b.get(i4)).e;
        }
        return i3;
    }
}
