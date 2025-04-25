package com.glority.android.datareader;

import android.content.res.AssetManager;
import android.util.Log;
import android.util.LruCache;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.MutableLiveData;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

/* compiled from: TSVReader.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000  *\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001 B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0002J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u0002J+\u0010\u000e\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014J(\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00122\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ'\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001cJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0012J\u0006\u0010\u001f\u001a\u00020\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/glority/android/datareader/TSVReader;", ExifInterface.GPS_DIRECTION_TRUE, "", "clazz", "Ljava/lang/Class;", "filePath", "", "asset", "Landroid/content/res/AssetManager;", "(Ljava/lang/Class;Ljava/lang/String;Landroid/content/res/AssetManager;)V", "getData", "", "getRows", "", "newInstance", "filed", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "queryAllAsync", "Landroidx/lifecycle/MutableLiveData;", "range", "Lkotlin/ranges/IntRange;", "queryAllSync", "queryOneAsync", "rowName", "keyword", "contains", "", "queryOneSync", "(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/Object;", "querySizeAsync", "", "querySizeSync", "Companion", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes13.dex */
public final class TSVReader<T> {
    public static final String TAG = "TSVReader";
    private static final LruCache<String, List<String>> cache;
    public static final String splitSymbols = "\t";
    private final AssetManager asset;
    private final Class<T> clazz;
    private final String filePath;
    private static HashMap<String, List<String>> rowCacheMap = new HashMap<>();

    public TSVReader(Class<T> clazz, String filePath, AssetManager asset) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.clazz = clazz;
        this.filePath = filePath;
        this.asset = asset;
    }

    static {
        final int i = 100000;
        cache = new LruCache<String, List<String>>(i) { // from class: com.glority.android.datareader.TSVReader$Companion$cache$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.util.LruCache
            public int sizeOf(String key, List<String> value) {
                if (value != null) {
                    return value.size();
                }
                return 1;
            }
        };
    }

    public static /* synthetic */ Object queryOneSync$default(TSVReader tSVReader, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return tSVReader.queryOneSync(str, str2, z);
    }

    public final T queryOneSync(String rowName, String keyword, boolean contains) {
        T t;
        boolean areEqual;
        Intrinsics.checkNotNullParameter(rowName, "rowName");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        long currentTimeMillis = System.currentTimeMillis();
        try {
            List<String> data = getData();
            int indexOf = getRows().indexOf(rowName);
            int i = 1;
            Iterator<T> it = data.subList(1, data.size()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = (T) null;
                    break;
                }
                t = it.next();
                String[] strArr = new String[i];
                strArr[0] = splitSymbols;
                String str = (String) StringsKt.split$default((CharSequence) t, strArr, false, 0, 6, (Object) null).get(indexOf);
                if (contains) {
                    areEqual = StringsKt.contains$default((CharSequence) str, (CharSequence) keyword, false, 2, (Object) null);
                } else {
                    areEqual = Intrinsics.areEqual(str, keyword);
                }
                if (areEqual) {
                    break;
                }
                i = 1;
            }
            T newInstance = newInstance(this.clazz, t);
            Log.d(TAG, "queryOneSync time " + (System.currentTimeMillis() - currentTimeMillis));
            return newInstance;
        } catch (Throwable unused) {
            Log.d(TAG, "queryOneSync time " + (System.currentTimeMillis() - currentTimeMillis));
            return null;
        }
    }

    public static /* synthetic */ MutableLiveData queryOneAsync$default(TSVReader tSVReader, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return tSVReader.queryOneAsync(str, str2, z);
    }

    public final MutableLiveData<T> queryOneAsync(String rowName, String keyword, boolean contains) {
        Intrinsics.checkNotNullParameter(rowName, "rowName");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        MutableLiveData<T> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new TSVReader$queryOneAsync$1(this, mutableLiveData, rowName, keyword, contains, null), 2, null);
        return mutableLiveData;
    }

    public final List<T> queryAllSync(IntRange range) {
        StringBuilder sb;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        try {
            List<String> data = getData();
            if (range == null) {
                range = new IntRange(1, data.size());
            }
            Iterator<T> it = data.subList(range.getFirst(), range.getLast()).iterator();
            while (it.hasNext()) {
                arrayList.add(newInstance(this.clazz, (String) it.next()));
            }
            sb = new StringBuilder("queryAllSync time ");
        } catch (Throwable unused) {
            sb = new StringBuilder("queryAllSync time ");
        }
        Log.d(TAG, sb.append(System.currentTimeMillis() - currentTimeMillis).toString());
        return arrayList;
    }

    public final MutableLiveData<List<T>> queryAllAsync(IntRange range) {
        MutableLiveData<List<T>> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new TSVReader$queryAllAsync$1(this, mutableLiveData, range, null), 2, null);
        return mutableLiveData;
    }

    public final int querySizeSync() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            int size = getData().size() - 1;
            Log.d(TAG, "getSizeSync time " + (System.currentTimeMillis() - currentTimeMillis));
            return size;
        } catch (Throwable unused) {
            Log.d(TAG, "getSizeSync time " + (System.currentTimeMillis() - currentTimeMillis));
            return 0;
        }
    }

    public final MutableLiveData<Integer> querySizeAsync() {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new TSVReader$querySizeAsync$1(this, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    private final <T> T newInstance(Class<T> clazz, String filed) {
        T newInstance = clazz.newInstance();
        int i = 0;
        for (T t : getRows()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            String str = (String) t;
            String str2 = null;
            List split$default = filed != null ? StringsKt.split$default((CharSequence) filed, new String[]{splitSymbols}, false, 0, 6, (Object) null) : null;
            Field field = clazz.getDeclaredField(str);
            Intrinsics.checkNotNullExpressionValue(field, "field");
            field.setAccessible(true);
            if (split$default != null) {
                str2 = (String) split$default.get(i);
            }
            field.set(newInstance, str2);
            i = i2;
        }
        return newInstance;
    }

    private final List<String> getRows() {
        ArrayList arrayList = rowCacheMap.get(this.filePath);
        if (arrayList == null) {
            List<String> list = cache.get(this.filePath);
            if (list == null) {
                InputStream open = this.asset.open(this.filePath);
                Intrinsics.checkNotNullExpressionValue(open, "asset.open(filePath)");
                String str = (String) CollectionsKt.firstOrNull((List) TextStreamsKt.readLines(new InputStreamReader(open, Charsets.UTF_8)));
                arrayList = str == null ? new ArrayList() : CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) str, new String[]{splitSymbols}, false, 0, 6, (Object) null));
            } else if (list.size() > 0) {
                arrayList = CollectionsKt.toMutableList((Collection) StringsKt.split$default((CharSequence) list.get(0), new String[]{splitSymbols}, false, 0, 6, (Object) null));
            } else {
                arrayList = new ArrayList();
            }
            HashMap<String, List<String>> hashMap = rowCacheMap;
            String str2 = this.filePath;
            ArrayList arrayList2 = new ArrayList();
            for (T t : arrayList) {
                if (((String) t).length() != 0) {
                    arrayList2.add(t);
                }
            }
            hashMap.put(str2, CollectionsKt.toMutableList((Collection) arrayList2));
        }
        return arrayList;
    }

    private final List<String> getData() {
        LruCache<String, List<String>> lruCache = cache;
        List<String> list = lruCache.get(this.filePath);
        if (list != null) {
            return list;
        }
        try {
            InputStream open = this.asset.open(this.filePath);
            Intrinsics.checkNotNullExpressionValue(open, "asset.open(filePath)");
            List<String> mutableList = CollectionsKt.toMutableList((Collection) TextStreamsKt.readLines(new InputStreamReader(open, Charsets.UTF_8)));
            lruCache.put(this.filePath, mutableList);
            return mutableList;
        } catch (Throwable th) {
            ArrayList arrayList = new ArrayList();
            cache.put(this.filePath, arrayList);
            Log.e(TAG, "test: " + th);
            return arrayList;
        }
    }
}
