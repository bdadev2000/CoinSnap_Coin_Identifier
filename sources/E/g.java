package E;

import T.G0;
import T.InterfaceC0292x;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g implements InterfaceC0292x {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f843c;

    /* renamed from: d, reason: collision with root package name */
    public final int f844d;

    /* renamed from: f, reason: collision with root package name */
    public final Object f845f;

    public g(int i9, int i10, int i11) {
        this.b = i11;
        switch (i11) {
            case 4:
                this.f845f = null;
                this.f843c = i9;
                int i12 = i10 & 7;
                this.f844d = i12 == 0 ? 8 : i12;
                return;
            default:
                this.f845f = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i10, i9);
                this.f843c = i9;
                this.f844d = i10;
                return;
        }
    }

    public byte a(int i9, int i10) {
        return ((byte[][]) this.f845f)[i10][i9];
    }

    public void b(int i9, int i10, int i11) {
        ((byte[][]) this.f845f)[i10][i9] = (byte) i11;
    }

    public void c(int i9, int i10, boolean z8) {
        ((byte[][]) this.f845f)[i10][i9] = z8 ? (byte) 1 : (byte) 0;
    }

    @Override // T.InterfaceC0292x
    public G0 j(View view, G0 g02) {
        int i9 = g02.f2863a.f(7).b;
        int i10 = this.f843c;
        View view2 = (View) this.f845f;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i9;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f844d + i9, view2.getPaddingRight(), view2.getPaddingBottom());
        return g02;
    }

    public String toString() {
        switch (this.b) {
            case 1:
                int i9 = this.f843c;
                int i10 = this.f844d;
                StringBuilder sb = new StringBuilder((i9 * 2 * i10) + 2);
                for (int i11 = 0; i11 < i10; i11++) {
                    byte[] bArr = ((byte[][]) this.f845f)[i11];
                    for (int i12 = 0; i12 < i9; i12++) {
                        byte b = bArr[i12];
                        if (b != 0) {
                            if (b != 1) {
                                sb.append("  ");
                            } else {
                                sb.append(" 1");
                            }
                        } else {
                            sb.append(" 0");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.b = 0;
        this.f845f = new ArrayList();
        this.f844d = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f962h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i9 = 0; i9 < indexCount; i9++) {
            int index = obtainStyledAttributes.getIndex(i9);
            if (index == 0) {
                this.f843c = obtainStyledAttributes.getResourceId(index, this.f843c);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f844d);
                this.f844d = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if (TtmlNode.TAG_LAYOUT.equals(resourceTypeName)) {
                    new o().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public g(byte[] bArr, int i9, int i10) {
        this.b = 3;
        this.f845f = bArr;
        this.f843c = i9;
        this.f844d = i10;
    }

    public g() {
        this.b = 4;
        this.f845f = new g[NotificationCompat.FLAG_LOCAL_ONLY];
        this.f843c = 0;
        this.f844d = 0;
    }

    public g(View view, int i9, int i10) {
        this.b = 2;
        this.f843c = i9;
        this.f845f = view;
        this.f844d = i10;
    }
}
