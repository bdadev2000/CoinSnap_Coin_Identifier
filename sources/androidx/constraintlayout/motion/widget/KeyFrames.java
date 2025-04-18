package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class KeyFrames {

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f17788b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f17789a = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        f17788b = hashMap;
        try {
            hashMap.put("KeyAttribute", KeyAttributes.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", KeyPosition.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", KeyCycle.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", KeyTimeCycle.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", KeyTrigger.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    public KeyFrames(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap hashMap = f17788b;
                    if (hashMap.containsKey(name)) {
                        try {
                            Key key = (Key) ((Constructor) hashMap.get(name)).newInstance(new Object[0]);
                            key.a(context, Xml.asAttributeSet(xmlResourceParser));
                            a(key);
                        } catch (Exception e) {
                            Log.e("KeyFrames", "unable to create ", e);
                        }
                    } else {
                        name.equalsIgnoreCase("CustomAttribute");
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public final void a(Key key) {
        Integer valueOf = Integer.valueOf(key.f17757b);
        HashMap hashMap = this.f17789a;
        if (!hashMap.containsKey(valueOf)) {
            hashMap.put(Integer.valueOf(key.f17757b), new ArrayList());
        }
        ((ArrayList) hashMap.get(Integer.valueOf(key.f17757b))).add(key);
    }
}
