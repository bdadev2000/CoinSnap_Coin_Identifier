package androidx.core.content;

import I.h;
import I.i;
import I.j;
import I.k;
import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class FileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String DISPLAYNAME_FIELD = "displayName";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private String mAuthority;

    @Nullable
    private j mLocalPathStrategy;

    @NonNull
    private final Object mLock;
    private final int mResourceId;
    private static final String[] COLUMNS = {"_display_name", "_size"};
    private static final File DEVICE_ROOT = new File("/");
    private static final HashMap<String, j> sCache = new HashMap<>();

    public FileProvider() {
        this(0);
    }

    private static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static String[] copyOf(String[] strArr, int i9) {
        String[] strArr2 = new String[i9];
        System.arraycopy(strArr, 0, strArr2, 0, i9);
        return strArr2;
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, @Nullable ProviderInfo providerInfo, int i9) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i9 != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(META_DATA_FILE_PROVIDER_PATHS, i9);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), META_DATA_FILE_PROVIDER_PATHS);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException(AbstractC2914a.d("Couldn't find meta-data for provider with authority ", str));
    }

    @NonNull
    private j getLocalPathStrategy() {
        j jVar;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority != null) {
                    if (this.mLocalPathStrategy == null) {
                        this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                    }
                    jVar = this.mLocalPathStrategy;
                } else {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    private static j getPathStrategy(Context context, String str, int i9) {
        j jVar;
        HashMap<String, j> hashMap = sCache;
        synchronized (hashMap) {
            try {
                jVar = hashMap.get(str);
                if (jVar == null) {
                    try {
                        try {
                            jVar = parsePathStrategy(context, str, i9);
                            hashMap.put(str, jVar);
                        } catch (XmlPullParserException e4) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e4);
                        }
                    } catch (IOException e9) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e9);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file) {
        String substring;
        k kVar = (k) getPathStrategy(context, str, 0);
        kVar.getClass();
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : kVar.b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (k.a(canonicalPath, path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                if (path2.endsWith("/")) {
                    substring = canonicalPath.substring(path2.length());
                } else {
                    substring = canonicalPath.substring(path2.length() + 1);
                }
                return new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(kVar.f1393a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(AbstractC2914a.d("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }

    private static int modeToMode(String str) {
        if (CampaignEx.JSON_KEY_AD_R.equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            throw new IllegalArgumentException(AbstractC2914a.d("Invalid mode: ", str));
        }
        return 738197504;
    }

    private static j parsePathStrategy(Context context, String str, int i9) throws IOException, XmlPullParserException {
        k kVar = new k(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i9);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next != 1) {
                if (next == 2) {
                    String name = fileProviderPathsMetaData.getName();
                    File file = null;
                    String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                    String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, "path");
                    if (TAG_ROOT_PATH.equals(name)) {
                        file = DEVICE_ROOT;
                    } else if (TAG_FILES_PATH.equals(name)) {
                        file = context.getFilesDir();
                    } else if (TAG_CACHE_PATH.equals(name)) {
                        file = context.getCacheDir();
                    } else if (TAG_EXTERNAL.equals(name)) {
                        file = Environment.getExternalStorageDirectory();
                    } else if (TAG_EXTERNAL_FILES.equals(name)) {
                        File[] externalFilesDirs = h.getExternalFilesDirs(context, null);
                        if (externalFilesDirs.length > 0) {
                            file = externalFilesDirs[0];
                        }
                    } else if (TAG_EXTERNAL_CACHE.equals(name)) {
                        File[] externalCacheDirs = h.getExternalCacheDirs(context);
                        if (externalCacheDirs.length > 0) {
                            file = externalCacheDirs[0];
                        }
                    } else if (TAG_EXTERNAL_MEDIA.equals(name)) {
                        File[] a6 = i.a(context);
                        if (a6.length > 0) {
                            file = a6[0];
                        }
                    }
                    if (file != null) {
                        File buildPath = buildPath(file, attributeValue2);
                        if (!TextUtils.isEmpty(attributeValue)) {
                            try {
                                kVar.b.put(attributeValue, buildPath.getCanonicalFile());
                            } catch (IOException e4) {
                                throw new IllegalArgumentException("Failed to resolve canonical path for " + buildPath, e4);
                            }
                        } else {
                            throw new IllegalArgumentException("Name must not be empty");
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                return kVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String removeTrailingSlash(@NonNull String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    @Override // android.content.ContentProvider
    @CallSuper
    public void attachInfo(@NonNull Context context, @NonNull ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                synchronized (this.mLock) {
                    this.mAuthority = str;
                }
                HashMap<String, j> hashMap = sCache;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        return ((k) getLocalPathStrategy()).b(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        File b = ((k) getLocalPathStrategy()).b(uri);
        int lastIndexOf = b.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(b.getName().substring(lastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    @Nullable
    public String getTypeAnonymous(@NonNull Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, @NonNull ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@NonNull Uri uri, @NonNull String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(((k) getLocalPathStrategy()).b(uri), modeToMode(str));
    }

    @Override // android.content.ContentProvider
    @NonNull
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        int i9;
        String str3;
        File b = ((k) getLocalPathStrategy()).b(uri);
        String queryParameter = uri.getQueryParameter(DISPLAYNAME_FIELD);
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i10 = 0;
        for (String str4 : strArr) {
            if ("_display_name".equals(str4)) {
                strArr3[i10] = "_display_name";
                i9 = i10 + 1;
                if (queryParameter == null) {
                    str3 = b.getName();
                } else {
                    str3 = queryParameter;
                }
                objArr[i10] = str3;
            } else if ("_size".equals(str4)) {
                strArr3[i10] = "_size";
                i9 = i10 + 1;
                objArr[i10] = Long.valueOf(b.length());
            }
            i10 = i9;
        }
        String[] copyOf = copyOf(strArr3, i10);
        Object[] copyOf2 = copyOf(objArr, i10);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @NonNull ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public FileProvider(int i9) {
        this.mLock = new Object();
        this.mResourceId = i9;
    }

    private static Object[] copyOf(Object[] objArr, int i9) {
        Object[] objArr2 = new Object[i9];
        System.arraycopy(objArr, 0, objArr2, 0, i9);
        return objArr2;
    }

    @NonNull
    @SuppressLint({"StreamFiles"})
    public static Uri getUriForFile(@NonNull Context context, @NonNull String str, @NonNull File file, @NonNull String str2) {
        return getUriForFile(context, str, file).buildUpon().appendQueryParameter(DISPLAYNAME_FIELD, str2).build();
    }
}
