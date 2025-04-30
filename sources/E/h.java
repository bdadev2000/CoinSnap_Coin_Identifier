package E;

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
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f846a;
    public final float b;

    /* renamed from: c, reason: collision with root package name */
    public final float f847c;

    /* renamed from: d, reason: collision with root package name */
    public final float f848d;

    /* renamed from: e, reason: collision with root package name */
    public final int f849e;

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f846a = Float.NaN;
        this.b = Float.NaN;
        this.f847c = Float.NaN;
        this.f848d = Float.NaN;
        this.f849e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f964j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f849e);
                this.f849e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f848d = obtainStyledAttributes.getDimension(index, this.f848d);
            } else if (index == 2) {
                this.b = obtainStyledAttributes.getDimension(index, this.b);
            } else if (index == 3) {
                this.f847c = obtainStyledAttributes.getDimension(index, this.f847c);
            } else if (index == 4) {
                this.f846a = obtainStyledAttributes.getDimension(index, this.f846a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
