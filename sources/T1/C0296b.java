package T1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import i2.C2341d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: T1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0296b implements u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2965a;
    public final Object b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2966c;

    public /* synthetic */ C0296b(int i9, Object obj, Object obj2) {
        this.f2965a = i9;
        this.b = obj;
        this.f2966c = obj2;
    }

    @Override // T1.u
    public final boolean a(Object obj) {
        switch (this.f2965a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                    return false;
                }
                return true;
            case 1:
                return true;
            case 2:
                Iterator it = ((List) this.b).iterator();
                while (it.hasNext()) {
                    if (((u) it.next()).a(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) this.b).getPackageName().equals(uri2.getAuthority())) {
                    return true;
                }
                return false;
        }
    }

    @Override // T1.u
    public final t b(Object obj, int i9, int i10, N1.i iVar) {
        Resources resources;
        t b;
        Uri uri;
        switch (this.f2965a) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new t(new C2341d(uri2), ((InterfaceC0295a) this.f2966c).f((AssetManager) this.b, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) iVar.c(Y1.c.b);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) this.b).getResources();
                }
                return new t(new C2341d(num), new C0302h(theme, resources, (i) this.f2966c, num.intValue()));
            case 2:
                List list = (List) this.b;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                N1.f fVar = null;
                for (int i11 = 0; i11 < size; i11++) {
                    u uVar = (u) list.get(i11);
                    if (uVar.a(obj) && (b = uVar.b(obj, i9, i10, iVar)) != null) {
                        arrayList.add(b.f2994c);
                        fVar = b.f2993a;
                    }
                }
                if (arrayList.isEmpty() || fVar == null) {
                    return null;
                }
                return new t(fVar, new y(arrayList, (S.c) this.f2966c));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources2 = (Resources) this.f2966c;
                try {
                    uri = Uri.parse("android.resource://" + resources2.getResourcePackageName(num2.intValue()) + '/' + resources2.getResourceTypeName(num2.intValue()) + '/' + resources2.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e4) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e4);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((u) this.b).b(uri, i9, i10, iVar);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                u uVar2 = (u) this.f2966c;
                t tVar = null;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt == 0) {
                            if (Log.isLoggable("ResourceUriLoader", 5)) {
                                Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                            }
                        } else {
                            tVar = uVar2.b(Integer.valueOf(parseInt), i9, i10, iVar);
                        }
                        return tVar;
                    } catch (NumberFormatException e9) {
                        if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e9);
                            return tVar;
                        }
                        return tVar;
                    }
                }
                if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri3.getPathSegments();
                    String str = pathSegments2.get(0);
                    String str2 = pathSegments2.get(1);
                    Context context = (Context) this.b;
                    int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
                    if (identifier == 0) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                        return null;
                    }
                    return uVar2.b(Integer.valueOf(identifier), i9, i10, iVar);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                return null;
        }
    }

    public String toString() {
        switch (this.f2965a) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.b).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0296b(Resources resources, u uVar) {
        this.f2965a = 3;
        this.f2966c = resources;
        this.b = uVar;
    }

    public C0296b(Context context, i iVar) {
        this.f2965a = 1;
        this.b = context.getApplicationContext();
        this.f2966c = iVar;
    }

    public C0296b(Context context, u uVar) {
        this.f2965a = 4;
        this.b = context.getApplicationContext();
        this.f2966c = uVar;
    }
}
