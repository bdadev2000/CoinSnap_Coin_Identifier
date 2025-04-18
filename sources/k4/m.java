package k4;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class m implements y {
    public final /* synthetic */ int a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f20251b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20252c;

    public m(ArrayList arrayList, m0.c cVar) {
        this.f20251b = arrayList;
        this.f20252c = cVar;
    }

    @Override // k4.y
    public final boolean a(Object obj) {
        int i10 = this.a;
        Object obj2 = this.f20251b;
        switch (i10) {
            case 0:
                return true;
            case 1:
                Iterator it = ((List) obj2).iterator();
                while (it.hasNext()) {
                    if (((y) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            case 2:
                return true;
            default:
                Uri uri = (Uri) obj;
                if (!"android.resource".equals(uri.getScheme()) || !((Context) obj2).getPackageName().equals(uri.getAuthority())) {
                    return false;
                }
                return true;
        }
    }

    @Override // k4.y
    public final x b(Object obj, int i10, int i11, e4.m mVar) {
        x b3;
        int i12 = this.a;
        Object obj2 = this.f20252c;
        x xVar = null;
        Object obj3 = this.f20251b;
        switch (i12) {
            case 0:
                return c((Integer) obj, i10, i11, mVar);
            case 1:
                List list = (List) obj3;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                e4.j jVar = null;
                for (int i13 = 0; i13 < size; i13++) {
                    y yVar = (y) list.get(i13);
                    if (yVar.a(obj) && (b3 = yVar.b(obj, i10, i11, mVar)) != null) {
                        arrayList.add(b3.f20271c);
                        jVar = b3.a;
                    }
                }
                if (arrayList.isEmpty() || jVar == null) {
                    return null;
                }
                return new x(jVar, new b0(arrayList, (m0.c) obj2));
            case 2:
                return c((Integer) obj, i10, i11, mVar);
            default:
                Uri uri = (Uri) obj;
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri.getPathSegments().get(0));
                        if (parseInt == 0) {
                            if (Log.isLoggable("ResourceUriLoader", 5)) {
                                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri);
                            }
                        } else {
                            xVar = ((y) obj2).b(Integer.valueOf(parseInt), i10, i11, mVar);
                        }
                        return xVar;
                    } catch (NumberFormatException e2) {
                        if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri, e2);
                            return xVar;
                        }
                        return xVar;
                    }
                }
                if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri.getPathSegments();
                    Context context = (Context) obj3;
                    int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                    if (identifier == 0) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri);
                        return null;
                    }
                    return ((y) obj2).b(Integer.valueOf(identifier), i10, i11, mVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri);
                return null;
        }
    }

    public final x c(Integer num, int i10, int i11, e4.m mVar) {
        Uri uri;
        Resources resources;
        int i12 = this.a;
        Object obj = this.f20252c;
        Object obj2 = this.f20251b;
        switch (i12) {
            case 0:
                Resources.Theme theme = (Resources.Theme) mVar.c(o4.d.f23133b);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) obj2).getResources();
                }
                return new x(new v4.d(num), new k(theme, resources, (l) obj, num.intValue()));
            default:
                try {
                    uri = Uri.parse("android.resource://" + ((Resources) obj).getResourcePackageName(num.intValue()) + '/' + ((Resources) obj).getResourceTypeName(num.intValue()) + '/' + ((Resources) obj).getResourceEntryName(num.intValue()));
                } catch (Resources.NotFoundException e2) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((y) obj2).b(uri, i10, i11, mVar);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.f20251b).toArray()) + AbstractJsonLexerKt.END_OBJ;
            default:
                return super.toString();
        }
    }

    public m(Resources resources, y yVar) {
        this.f20252c = resources;
        this.f20251b = yVar;
    }

    public m(Context context, l lVar) {
        this.f20251b = context.getApplicationContext();
        this.f20252c = lVar;
    }

    public m(Context context, y yVar) {
        this.f20251b = context.getApplicationContext();
        this.f20252c = yVar;
    }
}
