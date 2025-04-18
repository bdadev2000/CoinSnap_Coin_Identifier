package androidx.activity.result.contract;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import d0.k;
import e0.e0;
import e0.u;
import e0.w;
import e0.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.jacoco.core.runtime.AgentOptions;
import p0.a;

/* loaded from: classes.dex */
public final class ActivityResultContracts {

    /* loaded from: classes.dex */
    public static class CaptureVideo extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri uri = (Uri) obj;
            a.s(context, "context");
            a.s(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra(AgentOptions.OUTPUT, uri);
            a.r(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            a.s(context, "context");
            a.s(uri, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class CreateDocument extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String str = (String) obj;
            a.s(context, "context");
            a.s(str, "input");
            Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(null).putExtra("android.intent.extra.TITLE", str);
            a.r(putExtra, "Intent(Intent.ACTION_CRE…ntent.EXTRA_TITLE, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            a.s(context, "context");
            a.s(str, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static class GetContent extends ActivityResultContract<String, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String str = (String) obj;
            a.s(context, "context");
            a.s(str, "input");
            Intent type = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str);
            a.r(type, "Intent(Intent.ACTION_GET…          .setType(input)");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String str) {
            a.s(context, "context");
            a.s(str, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class GetMultipleContents extends ActivityResultContract<String, List<Uri>> {

        @RequiresApi
        /* loaded from: classes.dex */
        public static final class Companion {
            public static List a(Intent intent) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data = intent.getData();
                if (data != null) {
                    linkedHashSet.add(data);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    return w.f30218a;
                }
                if (clipData != null) {
                    int itemCount = clipData.getItemCount();
                    for (int i2 = 0; i2 < itemCount; i2++) {
                        Uri uri = clipData.getItemAt(i2).getUri();
                        if (uri != null) {
                            linkedHashSet.add(uri);
                        }
                    }
                }
                return new ArrayList(linkedHashSet);
            }
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String str = (String) obj;
            a.s(context, "context");
            a.s(str, "input");
            Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            a.r(putExtra, "Intent(Intent.ACTION_GET…TRA_ALLOW_MULTIPLE, true)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String str) {
            a.s(context, "context");
            a.s(str, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            return intent != null ? Companion.a(intent) : w.f30218a;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class OpenDocument extends ActivityResultContract<String[], Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String[] strArr = (String[]) obj;
            a.s(context, "context");
            a.s(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
            a.r(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, String[] strArr) {
            a.s(context, "context");
            a.s(strArr, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class OpenDocumentTree extends ActivityResultContract<Uri, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri uri = (Uri) obj;
            a.s(context, "context");
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            if (uri != null) {
                intent.putExtra("android.provider.extra.INITIAL_URI", uri);
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, Uri uri) {
            a.s(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class OpenMultipleDocuments extends ActivityResultContract<String[], List<Uri>> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String[] strArr = (String[]) obj;
            a.s(context, "context");
            a.s(strArr, "input");
            Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).putExtra("android.intent.extra.ALLOW_MULTIPLE", true).setType("*/*");
            a.r(type, "Intent(Intent.ACTION_OPE…          .setType(\"*/*\")");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, String[] strArr) {
            a.s(context, "context");
            a.s(strArr, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            return intent != null ? GetMultipleContents.Companion.a(intent) : w.f30218a;
        }
    }

    /* loaded from: classes.dex */
    public static final class PickContact extends ActivityResultContract<Void, Uri> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            a.s(context, "context");
            Intent type = new Intent("android.intent.action.PICK").setType("vnd.android.cursor.dir/contact");
            a.r(type, "Intent(Intent.ACTION_PIC…ct.Contacts.CONTENT_TYPE)");
            return type;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class PickMultipleVisualMedia extends ActivityResultContract<PickVisualMediaRequest, List<Uri>> {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x001f, code lost:
        
            if (r5 >= 2) goto L4;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.content.Intent createIntent(android.content.Context r4, java.lang.Object r5) {
            /*
                r3 = this;
                androidx.activity.result.PickVisualMediaRequest r5 = (androidx.activity.result.PickVisualMediaRequest) r5
                java.lang.String r0 = "context"
                p0.a.s(r4, r0)
                java.lang.String r0 = "input"
                p0.a.s(r5, r0)
                int r5 = android.os.Build.VERSION.SDK_INT
                r0 = 33
                r1 = 1
                r2 = 0
                if (r5 < r0) goto L16
            L14:
                r5 = r1
                goto L23
            L16:
                r0 = 30
                if (r5 < r0) goto L22
                int r5 = com.applovin.impl.bv.C()
                r0 = 2
                if (r5 < r0) goto L22
                goto L14
            L22:
                r5 = r2
            L23:
                r0 = 0
                if (r5 != 0) goto L93
                androidx.activity.ComponentActivity r4 = (androidx.activity.ComponentActivity) r4
                android.content.pm.ResolveInfo r5 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.b(r4)
                if (r5 == 0) goto L2f
                goto L30
            L2f:
                r1 = r2
            L30:
                java.lang.String r5 = "Required value was null."
                if (r1 == 0) goto L5a
                android.content.pm.ResolveInfo r4 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.b(r4)
                if (r4 != 0) goto L44
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L44:
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r5.<init>(r1)
                android.content.pm.ApplicationInfo r1 = r4.applicationInfo
                java.lang.String r1 = r1.packageName
                java.lang.String r4 = r4.name
                r5.setClassName(r1, r4)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.c()
                throw r0
            L5a:
                android.content.pm.ResolveInfo r1 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.a(r4)
                if (r1 == 0) goto L88
                android.content.pm.ResolveInfo r4 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.a(r4)
                if (r4 == 0) goto L7e
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r0 = "com.google.android.gms.provider.action.PICK_IMAGES"
                r5.<init>(r0)
                android.content.pm.ApplicationInfo r0 = r4.applicationInfo
                java.lang.String r0 = r0.packageName
                java.lang.String r4 = r4.name
                r5.setClassName(r0, r4)
                java.lang.String r4 = "com.google.android.gms.provider.extra.PICK_IMAGES_MAX"
                r5.putExtra(r4, r2)
                return r5
            L7e:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L88:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.intent.action.OPEN_DOCUMENT"
                r4.<init>(r5)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.c()
                throw r0
            L93:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.provider.action.PICK_IMAGES"
                r4.<init>(r5)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.c()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.contract.ActivityResultContracts.PickMultipleVisualMedia.createIntent(android.content.Context, java.lang.Object):android.content.Intent");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<List<Uri>> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            a.s(context, "context");
            a.s(pickVisualMediaRequest, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            return intent != null ? GetMultipleContents.Companion.a(intent) : w.f30218a;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class PickVisualMedia extends ActivityResultContract<PickVisualMediaRequest, Uri> {

        /* loaded from: classes.dex */
        public static final class Companion {
            public static ResolveInfo a(ComponentActivity componentActivity) {
                a.s(componentActivity, "context");
                return componentActivity.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
            }

            public static ResolveInfo b(ComponentActivity componentActivity) {
                a.s(componentActivity, "context");
                return componentActivity.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            }

            public static void c() {
                a.s(null, "input");
                throw new RuntimeException();
            }
        }

        /* loaded from: classes.dex */
        public static final class ImageAndVideo implements VisualMediaType {
        }

        /* loaded from: classes.dex */
        public static final class ImageOnly implements VisualMediaType {
        }

        /* loaded from: classes.dex */
        public static final class SingleMimeType implements VisualMediaType {
        }

        /* loaded from: classes.dex */
        public static final class VideoOnly implements VisualMediaType {
        }

        /* loaded from: classes.dex */
        public interface VisualMediaType {
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x001f, code lost:
        
            if (r5 >= 2) goto L4;
         */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
        @Override // androidx.activity.result.contract.ActivityResultContract
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final android.content.Intent createIntent(android.content.Context r4, java.lang.Object r5) {
            /*
                r3 = this;
                androidx.activity.result.PickVisualMediaRequest r5 = (androidx.activity.result.PickVisualMediaRequest) r5
                java.lang.String r0 = "context"
                p0.a.s(r4, r0)
                java.lang.String r0 = "input"
                p0.a.s(r5, r0)
                int r5 = android.os.Build.VERSION.SDK_INT
                r0 = 33
                r1 = 0
                r2 = 1
                if (r5 < r0) goto L16
            L14:
                r5 = r2
                goto L23
            L16:
                r0 = 30
                if (r5 < r0) goto L22
                int r5 = com.applovin.impl.bv.C()
                r0 = 2
                if (r5 < r0) goto L22
                goto L14
            L22:
                r5 = r1
            L23:
                r0 = 0
                if (r5 != 0) goto L90
                androidx.activity.ComponentActivity r4 = (androidx.activity.ComponentActivity) r4
                android.content.pm.ResolveInfo r5 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.b(r4)
                if (r5 == 0) goto L2f
                r1 = r2
            L2f:
                java.lang.String r5 = "Required value was null."
                if (r1 == 0) goto L59
                android.content.pm.ResolveInfo r4 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.b(r4)
                if (r4 != 0) goto L43
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L43:
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r1 = "androidx.activity.result.contract.action.PICK_IMAGES"
                r5.<init>(r1)
                android.content.pm.ApplicationInfo r1 = r4.applicationInfo
                java.lang.String r1 = r1.packageName
                java.lang.String r4 = r4.name
                r5.setClassName(r1, r4)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.c()
                throw r0
            L59:
                android.content.pm.ResolveInfo r1 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.a(r4)
                if (r1 == 0) goto L85
                android.content.pm.ResolveInfo r4 = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.a(r4)
                if (r4 != 0) goto L6f
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            L6f:
                android.content.pm.ActivityInfo r4 = r4.activityInfo
                android.content.Intent r5 = new android.content.Intent
                java.lang.String r1 = "com.google.android.gms.provider.action.PICK_IMAGES"
                r5.<init>(r1)
                android.content.pm.ApplicationInfo r1 = r4.applicationInfo
                java.lang.String r1 = r1.packageName
                java.lang.String r4 = r4.name
                r5.setClassName(r1, r4)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.c()
                throw r0
            L85:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.intent.action.OPEN_DOCUMENT"
                r4.<init>(r5)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.c()
                throw r0
            L90:
                android.content.Intent r4 = new android.content.Intent
                java.lang.String r5 = "android.provider.action.PICK_IMAGES"
                r4.<init>(r5)
                androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.Companion.c()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.createIntent(android.content.Context, java.lang.Object):android.content.Intent");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Uri> getSynchronousResult(Context context, PickVisualMediaRequest pickVisualMediaRequest) {
            a.s(context, "context");
            a.s(pickVisualMediaRequest, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent == null) {
                return null;
            }
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) u.F0(GetMultipleContents.Companion.a(intent));
            }
            return data;
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestMultiplePermissions extends ActivityResultContract<String[], Map<String, Boolean>> {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String[] strArr = (String[]) obj;
            a.s(context, "context");
            a.s(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            a.r(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
            String[] strArr2 = strArr;
            a.s(context, "context");
            a.s(strArr2, "input");
            if (strArr2.length == 0) {
                return new ActivityResultContract.SynchronousResult<>(x.f30219a);
            }
            for (String str : strArr2) {
                if (ContextCompat.checkSelfPermission(context, str) != 0) {
                    return null;
                }
            }
            int g2 = q.g(strArr2.length);
            if (g2 < 16) {
                g2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(g2);
            for (String str2 : strArr2) {
                linkedHashMap.put(str2, Boolean.TRUE);
            }
            return new ActivityResultContract.SynchronousResult<>(linkedHashMap);
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            x xVar = x.f30219a;
            if (i2 != -1 || intent == null) {
                return xVar;
            }
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return xVar;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i3 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i3 == 0));
            }
            ArrayList a02 = e0.q.a0(stringArrayExtra);
            Iterator it = a02.iterator();
            Iterator it2 = arrayList.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(e0.q.M(a02, 10), e0.q.M(arrayList, 10)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList2.add(new k(it.next(), it2.next()));
            }
            return e0.w(arrayList2);
        }
    }

    /* loaded from: classes.dex */
    public static final class RequestPermission extends ActivityResultContract<String, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            String str = (String) obj;
            a.s(context, "context");
            a.s(str, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
            a.r(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, String str) {
            String str2 = str;
            a.s(context, "context");
            a.s(str2, "input");
            if (ContextCompat.checkSelfPermission(context, str2) == 0) {
                return new ActivityResultContract.SynchronousResult<>(Boolean.TRUE);
            }
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (intent == null || i2 != -1) {
                return Boolean.FALSE;
            }
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            boolean z2 = false;
            if (intArrayExtra != null) {
                int length = intArrayExtra.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        break;
                    }
                    if (intArrayExtra[i3] == 0) {
                        z2 = true;
                        break;
                    }
                    i3++;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* loaded from: classes.dex */
    public static final class StartActivityForResult extends ActivityResultContract<Intent, ActivityResult> {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Intent intent = (Intent) obj;
            a.s(context, "context");
            a.s(intent, "input");
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* loaded from: classes.dex */
    public static final class StartIntentSenderForResult extends ActivityResultContract<IntentSenderRequest, ActivityResult> {

        /* loaded from: classes.dex */
        public static final class Companion {
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
            a.s(context, "context");
            a.s(intentSenderRequest, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
            a.r(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            return new ActivityResult(i2, intent);
        }
    }

    /* loaded from: classes.dex */
    public static class TakePicture extends ActivityResultContract<Uri, Boolean> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri uri = (Uri) obj;
            a.s(context, "context");
            a.s(uri, "input");
            Intent putExtra = new Intent("android.media.action.IMAGE_CAPTURE").putExtra(AgentOptions.OUTPUT, uri);
            a.r(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Boolean> getSynchronousResult(Context context, Uri uri) {
            a.s(context, "context");
            a.s(uri, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            return Boolean.valueOf(i2 == -1);
        }
    }

    /* loaded from: classes.dex */
    public static class TakePicturePreview extends ActivityResultContract<Void, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            a.s(context, "context");
            return new Intent("android.media.action.IMAGE_CAPTURE");
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Void r2) {
            a.s(context, "context");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }

    @d0.a
    /* loaded from: classes.dex */
    public static class TakeVideo extends ActivityResultContract<Uri, Bitmap> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent createIntent(Context context, Object obj) {
            Uri uri = (Uri) obj;
            a.s(context, "context");
            a.s(uri, "input");
            Intent putExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra(AgentOptions.OUTPUT, uri);
            a.r(putExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
            return putExtra;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final ActivityResultContract.SynchronousResult<Bitmap> getSynchronousResult(Context context, Uri uri) {
            a.s(context, "context");
            a.s(uri, "input");
            return null;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Object parseResult(int i2, Intent intent) {
            if (i2 != -1) {
                intent = null;
            }
            if (intent != null) {
                return (Bitmap) intent.getParcelableExtra("data");
            }
            return null;
        }
    }
}
