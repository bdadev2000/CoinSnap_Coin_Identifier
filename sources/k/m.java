package k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.net.Uri;
import android.util.TypedValue;
import android.webkit.MimeTypeMap;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import e0.u;
import h.e0;
import h.f0;
import h.g0;
import okio.Okio;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes3.dex */
public final class m implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f30890a;

    /* renamed from: b, reason: collision with root package name */
    public final q.n f30891b;

    public m(Uri uri, q.n nVar) {
        this.f30890a = uri;
        this.f30891b = nVar;
    }

    @Override // k.g
    public final Object a(h0.g gVar) {
        Integer J0;
        Drawable b2;
        Uri uri = this.f30890a;
        String authority = uri.getAuthority();
        if (authority != null) {
            boolean z2 = true;
            if (!(!z0.m.Z0(authority))) {
                authority = null;
            }
            if (authority != null) {
                String str = (String) u.M0(uri.getPathSegments());
                if (str == null || (J0 = z0.j.J0(str)) == null) {
                    throw new IllegalStateException("Invalid android.resource URI: " + uri);
                }
                int intValue = J0.intValue();
                q.n nVar = this.f30891b;
                Context context = nVar.f31314a;
                Resources resources = p0.a.g(authority, context.getPackageName()) ? context.getResources() : context.getPackageManager().getResourcesForApplication(authority);
                TypedValue typedValue = new TypedValue();
                resources.getValue(intValue, typedValue, true);
                CharSequence charSequence = typedValue.string;
                String b3 = v.g.b(MimeTypeMap.getSingleton(), charSequence.subSequence(z0.m.a1(charSequence, '/', 0, 6), charSequence.length()).toString());
                if (!p0.a.g(b3, "text/xml")) {
                    TypedValue typedValue2 = new TypedValue();
                    return new n(new g0(Okio.buffer(Okio.source(resources.openRawResource(intValue, typedValue2))), new e0(context, 1), new f0(authority, intValue, typedValue2.density)), b3, h.g.f30670c);
                }
                if (p0.a.g(authority, context.getPackageName())) {
                    b2 = AppCompatResources.a(context, intValue);
                    if (b2 == null) {
                        throw new IllegalStateException(android.support.v4.media.d.i("Invalid resource ID: ", intValue).toString());
                    }
                } else {
                    XmlResourceParser xml = resources.getXml(intValue);
                    int next = xml.next();
                    while (next != 2 && next != 1) {
                        next = xml.next();
                    }
                    if (next != 2) {
                        throw new XmlPullParserException("No start tag found.");
                    }
                    b2 = ResourcesCompat.b(resources, intValue, context.getTheme());
                    if (b2 == null) {
                        throw new IllegalStateException(android.support.v4.media.d.i("Invalid resource ID: ", intValue).toString());
                    }
                }
                if (!(b2 instanceof VectorDrawable) && !(b2 instanceof VectorDrawableCompat)) {
                    z2 = false;
                }
                if (z2) {
                    b2 = new BitmapDrawable(context.getResources(), p0.a.I(b2, nVar.f31315b, nVar.d, nVar.e, nVar.f31317f));
                }
                return new d(b2, z2, h.g.f30670c);
            }
        }
        throw new IllegalStateException("Invalid android.resource URI: " + uri);
    }
}
