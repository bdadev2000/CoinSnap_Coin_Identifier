package com.cooldev.gba.emulator.gameboy.features.home.models;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
import com.facebook.share.internal.ShareConstants;
import d0.m;
import e0.e0;
import e0.g0;
import e0.t;
import e0.u;
import e0.w;
import e0.y;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import y0.e;
import z0.f;
import z0.h;

@StabilityInferred
/* loaded from: classes2.dex */
public final class StorageFilesMerger {
    public static final int $stable = 0;

    @NotNull
    public static final StorageFilesMerger INSTANCE = new StorageFilesMerger();

    private StorageFilesMerger() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [d0.m] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    private final List<String> extractBinFiles(Context context, Uri uri) {
        ?? d;
        List readLines$default;
        w wVar = w.f30218a;
        try {
            InputStream inputStream = getInputStream(uri, context);
            if (inputStream == null || (readLines$default = UtilsKt.readLines$default(inputStream, null, 1, null)) == null) {
                d = wVar;
            } else {
                d = new ArrayList();
                Iterator it = readLines$default.iterator();
                while (it.hasNext()) {
                    f a2 = h.a(new h("FILE \"(.*)\""), (String) it.next());
                    String str = a2 != null ? (String) ((g0) a2.a()).get(1) : null;
                    if (str != null) {
                        d.add(str);
                    }
                }
            }
        } catch (Throwable th) {
            d = q.d(th);
        }
        if (!(d instanceof m)) {
            wVar = d;
        }
        return wVar;
    }

    private final void mergeBinCueFiles(Context context, Map<BaseStorageFile, List<BaseStorageFile>> map) {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(y0.m.L(u.z0(map.keySet()), StorageFilesMerger$mergeBinCueFiles$1.INSTANCE));
        while (eVar.hasNext()) {
            BaseStorageFile baseStorageFile = (BaseStorageFile) eVar.next();
            List<String> extractBinFiles = INSTANCE.extractBinFiles(context, baseStorageFile.getUri());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<BaseStorageFile, List<BaseStorageFile>> entry : map.entrySet()) {
                if (extractBinFiles.contains(entry.getKey().getName())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<BaseStorageFile> list = map.get(baseStorageFile);
            if (list == null) {
                list = w.f30218a;
            }
            List<BaseStorageFile> list2 = list;
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                t.t0(arrayList2, u.P0((Iterable) entry2.getValue(), f0.u(entry2.getKey())));
            }
            map.put(baseStorageFile, u.P0(arrayList2, list2));
            arrayList.addAll(linkedHashMap.keySet());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((BaseStorageFile) it.next());
        }
    }

    private final void mergeM3UPlaylists(Context context, Map<BaseStorageFile, List<BaseStorageFile>> map) {
        Object d;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(y0.m.L(u.z0(map.keySet()), StorageFilesMerger$mergeM3UPlaylists$1.INSTANCE));
        while (eVar.hasNext()) {
            BaseStorageFile baseStorageFile = (BaseStorageFile) eVar.next();
            try {
                InputStream inputStream = INSTANCE.getInputStream(baseStorageFile.getUri(), context);
                d = inputStream != null ? UtilsKt.readLines$default(inputStream, null, 1, null) : null;
            } catch (Throwable th) {
                d = q.d(th);
            }
            List list = (List) (d instanceof m ? null : d);
            if (list == null) {
                list = w.f30218a;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<BaseStorageFile, List<BaseStorageFile>> entry : map.entrySet()) {
                if (list.contains(entry.getKey().getName())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            List<BaseStorageFile> list2 = map.get(baseStorageFile);
            a.p(list2);
            List<BaseStorageFile> list3 = list2;
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                t.t0(arrayList2, u.P0((Iterable) entry2.getValue(), f0.u(entry2.getKey())));
            }
            map.put(baseStorageFile, u.P0(arrayList2, list3));
            arrayList.addAll(linkedHashMap.keySet());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.remove((BaseStorageFile) it.next());
        }
    }

    private final void removeInvalidBinCuePairs(Context context, Map<BaseStorageFile, List<BaseStorageFile>> map) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(y0.m.L(u.z0(map.keySet()), StorageFilesMerger$removeInvalidBinCuePairs$1.INSTANCE));
        while (eVar.hasNext()) {
            BaseStorageFile baseStorageFile = (BaseStorageFile) eVar.next();
            Set e12 = u.e1(INSTANCE.extractBinFiles(context, baseStorageFile.getUri()));
            List<BaseStorageFile> list = map.get(baseStorageFile);
            if (list != null) {
                List<BaseStorageFile> list2 = list;
                ArrayList arrayList2 = new ArrayList(e0.q.M(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((BaseStorageFile) it.next()).getName());
                }
                obj = u.e1(arrayList2);
            } else {
                obj = y.f30220a;
            }
            if (!a.g(e12, obj)) {
                arrayList.add(baseStorageFile);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            map.remove((BaseStorageFile) it2.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [e0.w] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    private final void removeInvalidM3UPlaylists(Context context, Map<BaseStorageFile, List<BaseStorageFile>> map) {
        Object d;
        ArrayList arrayList = new ArrayList();
        e eVar = new e(y0.m.L(u.z0(map.keySet()), StorageFilesMerger$removeInvalidM3UPlaylists$1.INSTANCE));
        while (eVar.hasNext()) {
            BaseStorageFile baseStorageFile = (BaseStorageFile) eVar.next();
            try {
                InputStream inputStream = INSTANCE.getInputStream(baseStorageFile.getUri(), context);
                d = inputStream != null ? UtilsKt.readLines$default(inputStream, null, 1, null) : null;
            } catch (Throwable th) {
                d = q.d(th);
            }
            List list = (List) (d instanceof m ? null : d);
            ?? r3 = w.f30218a;
            if (list == null) {
                list = r3;
            }
            List<BaseStorageFile> list2 = map.get(baseStorageFile);
            if (list2 != null) {
                List<BaseStorageFile> list3 = list2;
                r3 = new ArrayList(e0.q.M(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    r3.add(((BaseStorageFile) it.next()).getName());
                }
            }
            if (!r3.containsAll(list)) {
                arrayList.add(baseStorageFile);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            map.remove((BaseStorageFile) it2.next());
        }
    }

    @Nullable
    public final InputStream getInputStream(@NotNull Uri uri, @NotNull Context context) {
        a.s(uri, ShareConstants.MEDIA_URI);
        a.s(context, "context");
        return context.getContentResolver().openInputStream(uri);
    }

    @NotNull
    public final List<GroupedStorageFiles> mergeDataFiles(@NotNull Context context, @NotNull List<BaseStorageFile> list) {
        a.s(context, "context");
        a.s(list, "files");
        List<BaseStorageFile> list2 = list;
        int g2 = q.g(e0.q.M(list2, 10));
        if (g2 < 16) {
            g2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(g2);
        for (Object obj : list2) {
            linkedHashMap.put(obj, w.f30218a);
        }
        LinkedHashMap z2 = e0.z(linkedHashMap);
        mergeBinCueFiles(context, z2);
        removeInvalidBinCuePairs(context, z2);
        mergeM3UPlaylists(context, z2);
        removeInvalidM3UPlaylists(context, z2);
        ArrayList arrayList = new ArrayList(z2.size());
        for (Map.Entry entry : z2.entrySet()) {
            arrayList.add(new GroupedStorageFiles((BaseStorageFile) entry.getKey(), (List) entry.getValue()));
        }
        return arrayList;
    }
}
