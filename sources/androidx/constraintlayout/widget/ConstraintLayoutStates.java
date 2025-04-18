package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ConstraintLayoutStates {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f18238a;

    /* renamed from: b, reason: collision with root package name */
    public int f18239b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f18240c = -1;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();

    /* loaded from: classes.dex */
    public static class State {

        /* renamed from: a, reason: collision with root package name */
        public final int f18241a;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f18242b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final int f18243c;
        public final ConstraintSet d;

        public State(Context context, XmlResourceParser xmlResourceParser) {
            this.f18243c = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.f18339p);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 0) {
                    this.f18241a = obtainStyledAttributes.getResourceId(index, this.f18241a);
                } else if (index == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f18243c);
                    this.f18243c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.d = constraintSet;
                        constraintSet.d((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* loaded from: classes.dex */
    public static class Variant {

        /* renamed from: a, reason: collision with root package name */
        public final float f18244a;

        /* renamed from: b, reason: collision with root package name */
        public final float f18245b;

        /* renamed from: c, reason: collision with root package name */
        public final float f18246c;
        public final float d;
        public final int e;

        /* renamed from: f, reason: collision with root package name */
        public final ConstraintSet f18247f;

        public Variant(Context context, XmlResourceParser xmlResourceParser) {
            this.f18244a = Float.NaN;
            this.f18245b = Float.NaN;
            this.f18246c = Float.NaN;
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
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f18247f = constraintSet;
                        constraintSet.d((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.d = obtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.f18245b = obtainStyledAttributes.getDimension(index, this.f18245b);
                } else if (index == 3) {
                    this.f18246c = obtainStyledAttributes.getDimension(index, this.f18246c);
                } else if (index == 4) {
                    this.f18244a = obtainStyledAttributes.getDimension(index, this.f18244a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        public final boolean a(float f2, float f3) {
            float f4 = this.f18244a;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.f18245b;
            if (!Float.isNaN(f5) && f3 < f5) {
                return false;
            }
            float f6 = this.f18246c;
            if (!Float.isNaN(f6) && f2 > f6) {
                return false;
            }
            float f7 = this.d;
            return Float.isNaN(f7) || f3 <= f7;
        }
    }

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i2) {
        char c2;
        State state = null;
        this.f18238a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c2 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c2 = 0;
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
                            state = new State(context, xml);
                            this.d.put(state.f18241a, state);
                        } else if (c2 == 3) {
                            Variant variant = new Variant(context, xml);
                            if (state != null) {
                                state.f18242b.add(variant);
                            }
                        } else if (c2 != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            a(context, xml);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if ("id".equals(xmlResourceParser.getAttributeName(i2))) {
                String attributeValue = xmlResourceParser.getAttributeValue(i2);
                int identifier = attributeValue.contains(RemoteSettings.FORWARD_SLASH_STRING) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.i(context, xmlResourceParser);
                this.e.put(identifier, constraintSet);
                return;
            }
        }
    }

    public final void b(float f2, float f3, int i2) {
        int i3 = this.f18239b;
        SparseArray sparseArray = this.d;
        int i4 = 0;
        ConstraintLayout constraintLayout = this.f18238a;
        if (i3 == i2) {
            State state = i2 == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(i3);
            int i5 = this.f18240c;
            if (i5 == -1 || !((Variant) state.f18242b.get(i5)).a(f2, f3)) {
                while (true) {
                    ArrayList arrayList = state.f18242b;
                    if (i4 >= arrayList.size()) {
                        i4 = -1;
                        break;
                    } else if (((Variant) arrayList.get(i4)).a(f2, f3)) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (this.f18240c == i4) {
                    return;
                }
                ArrayList arrayList2 = state.f18242b;
                ConstraintSet constraintSet = i4 == -1 ? null : ((Variant) arrayList2.get(i4)).f18247f;
                if (i4 != -1) {
                    int i6 = ((Variant) arrayList2.get(i4)).e;
                }
                if (constraintSet == null) {
                    return;
                }
                this.f18240c = i4;
                constraintSet.b(constraintLayout);
                return;
            }
            return;
        }
        this.f18239b = i2;
        State state2 = (State) sparseArray.get(i2);
        while (true) {
            ArrayList arrayList3 = state2.f18242b;
            if (i4 >= arrayList3.size()) {
                i4 = -1;
                break;
            } else if (((Variant) arrayList3.get(i4)).a(f2, f3)) {
                break;
            } else {
                i4++;
            }
        }
        ArrayList arrayList4 = state2.f18242b;
        ConstraintSet constraintSet2 = i4 == -1 ? state2.d : ((Variant) arrayList4.get(i4)).f18247f;
        if (i4 != -1) {
            int i7 = ((Variant) arrayList4.get(i4)).e;
        }
        if (constraintSet2 != null) {
            this.f18240c = i4;
            constraintSet2.b(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i2 + ", dim =" + f2 + ", " + f3);
    }
}
