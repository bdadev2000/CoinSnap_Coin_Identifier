package Q;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import com.applovin.sdk.AppLovinEventTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final M2.b f2451a = new M2.b(3);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static B3.g a(Context context, F1.i iVar) {
        ?? r82;
        int i9;
        int i10;
        Uri withAppendedId;
        int i11;
        boolean z8;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) iVar.f1084c;
        int i12 = 0;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) iVar.f1085d;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                M2.b bVar = f2451a;
                Collections.sort(arrayList, bVar);
                List list = (List) iVar.f1087g;
                if (list == null) {
                    list = K.b.j(resources, 0);
                }
                int i13 = 0;
                loop1: while (true) {
                    r82 = 0;
                    r82 = 0;
                    r82 = 0;
                    r82 = 0;
                    if (i13 < list.size()) {
                        ArrayList arrayList2 = new ArrayList((Collection) list.get(i13));
                        Collections.sort(arrayList2, bVar);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                                if (!Arrays.equals((byte[]) arrayList.get(i14), (byte[]) arrayList2.get(i14))) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        i13++;
                    } else {
                        resolveContentProvider = null;
                        break;
                    }
                }
                int i15 = 1;
                if (resolveContentProvider == null) {
                    return new B3.g((Object[]) r82, i15, 4);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str4).build();
                Uri build2 = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(str4).appendPath("file").build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                try {
                    String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                    String[] strArr2 = {(String) iVar.f1086f};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            r82 = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e4) {
                            Log.w("FontsProvider", "Unable to query the content provider", e4);
                        }
                    }
                    if (r82 != 0 && r82.getCount() > 0) {
                        int columnIndex = r82.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = r82.getColumnIndex("_id");
                        int columnIndex3 = r82.getColumnIndex("file_id");
                        int columnIndex4 = r82.getColumnIndex("font_ttc_index");
                        int columnIndex5 = r82.getColumnIndex("font_weight");
                        int columnIndex6 = r82.getColumnIndex("font_italic");
                        while (r82.moveToNext()) {
                            if (columnIndex != -1) {
                                i9 = r82.getInt(columnIndex);
                            } else {
                                i9 = 0;
                            }
                            if (columnIndex4 != -1) {
                                i10 = r82.getInt(columnIndex4);
                            } else {
                                i10 = 0;
                            }
                            if (columnIndex3 == -1) {
                                withAppendedId = ContentUris.withAppendedId(build, r82.getLong(columnIndex2));
                            } else {
                                withAppendedId = ContentUris.withAppendedId(build2, r82.getLong(columnIndex3));
                            }
                            Uri uri = withAppendedId;
                            if (columnIndex5 != -1) {
                                i11 = r82.getInt(columnIndex5);
                            } else {
                                i11 = 400;
                            }
                            int i16 = i11;
                            if (columnIndex6 != -1 && r82.getInt(columnIndex6) == 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            arrayList3.add(new g(uri, i10, i16, z8, i9));
                        }
                    }
                    if (r82 != 0) {
                        r82.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return new B3.g((g[]) arrayList3.toArray(new g[0]), i12, 4);
                } catch (Throwable th) {
                    if (r82 != 0) {
                        r82.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    throw th;
                }
            }
            throw new PackageManager.NameNotFoundException(AbstractC2914a.k("Found content provider ", str, ", but package was not ", str3));
        }
        throw new PackageManager.NameNotFoundException(AbstractC2914a.d("No package found for authority: ", str));
    }
}
