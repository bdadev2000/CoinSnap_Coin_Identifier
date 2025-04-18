package z;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class g {
    public final SparseArray a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f28357b = new SparseArray();

    public g(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            androidx.activity.result.i iVar = null;
            while (true) {
                char c10 = 1;
                if (eventType != 1) {
                    if (eventType != 0) {
                        if (eventType == 2) {
                            String name = xml.getName();
                            switch (name.hashCode()) {
                                case -1349929691:
                                    if (name.equals("ConstraintSet")) {
                                        c10 = 4;
                                        break;
                                    }
                                    break;
                                case 80204913:
                                    if (name.equals("State")) {
                                        c10 = 2;
                                        break;
                                    }
                                    break;
                                case 1382829617:
                                    if (name.equals("StateSet")) {
                                        break;
                                    }
                                    break;
                                case 1657696882:
                                    if (name.equals("layoutDescription")) {
                                        c10 = 0;
                                        break;
                                    }
                                    break;
                                case 1901439077:
                                    if (name.equals("Variant")) {
                                        c10 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c10 = 65535;
                            if (c10 != 2) {
                                if (c10 != 3) {
                                    if (c10 == 4) {
                                        a(context, xml);
                                    }
                                } else {
                                    f fVar = new f(context, xml);
                                    if (iVar != null) {
                                        ((ArrayList) iVar.f610d).add(fVar);
                                    }
                                }
                            } else {
                                androidx.activity.result.i iVar2 = new androidx.activity.result.i(context, xml);
                                this.a.put(iVar2.f608b, iVar2);
                                iVar = iVar2;
                            }
                        }
                    } else {
                        xml.getName();
                    }
                    eventType = xml.next();
                } else {
                    return;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0226, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:60:0x0139. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.g.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
