package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class f {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f28353b;

    /* renamed from: c, reason: collision with root package name */
    public final float f28354c;

    /* renamed from: d, reason: collision with root package name */
    public final float f28355d;

    /* renamed from: e, reason: collision with root package name */
    public final int f28356e;

    public f(Context context, XmlResourceParser xmlResourceParser) {
        this.a = Float.NaN;
        this.f28353b = Float.NaN;
        this.f28354c = Float.NaN;
        this.f28355d = Float.NaN;
        this.f28356e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f28453j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f28356e);
                this.f28356e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f28355d = obtainStyledAttributes.getDimension(index, this.f28355d);
            } else if (index == 2) {
                this.f28353b = obtainStyledAttributes.getDimension(index, this.f28353b);
            } else if (index == 3) {
                this.f28354c = obtainStyledAttributes.getDimension(index, this.f28354c);
            } else if (index == 4) {
                this.a = obtainStyledAttributes.getDimension(index, this.a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
