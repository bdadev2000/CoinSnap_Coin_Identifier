package kotlin.io;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@SourceDebugExtension({"SMAP\nFilePathComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1549#2:149\n1620#2,3:150\n*S KotlinDebug\n*F\n+ 1 FilePathComponents.kt\nkotlin/io/FilesKt__FilePathComponentsKt\n*L\n133#1:149\n133#1:150,3\n*E\n"})
/* loaded from: classes4.dex */
public class FilesKt__FilePathComponentsKt {
    public static final File getRoot(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new File(getRootName(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        r0 = kotlin.text.StringsKt__StringsKt.indexOf$default(r5, r1, 2, false, 4, (java.lang.Object) null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final int getRootLength$FilesKt__FilePathComponentsKt(java.lang.String r5) {
        /*
            char r0 = java.io.File.separatorChar
            r1 = 0
            r2 = 4
            int r0 = kotlin.text.StringsKt.j(r5, r0, r1, r2)
            r3 = 1
            if (r0 != 0) goto L31
            int r0 = r5.length()
            if (r0 <= r3) goto L30
            char r0 = r5.charAt(r3)
            char r1 = java.io.File.separatorChar
            if (r0 != r1) goto L30
            r0 = 2
            int r0 = kotlin.text.StringsKt.j(r5, r1, r0, r2)
            if (r0 < 0) goto L30
            char r1 = java.io.File.separatorChar
            int r0 = r0 + r3
            int r0 = kotlin.text.StringsKt.j(r5, r1, r0, r2)
            if (r0 < 0) goto L2b
            int r0 = r0 + r3
            return r0
        L2b:
            int r5 = r5.length()
            return r5
        L30:
            return r3
        L31:
            r2 = 58
            if (r0 <= 0) goto L3f
            int r4 = r0 + (-1)
            char r4 = r5.charAt(r4)
            if (r4 != r2) goto L3f
            int r0 = r0 + r3
            return r0
        L3f:
            r3 = -1
            if (r0 != r3) goto L4d
            boolean r0 = kotlin.text.StringsKt.g(r5, r2)
            if (r0 == 0) goto L4d
            int r5 = r5.length()
            return r5
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.FilesKt__FilePathComponentsKt.getRootLength$FilesKt__FilePathComponentsKt(java.lang.String):int");
    }

    public static final String getRootName(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String path2 = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        String substring = path.substring(0, getRootLength$FilesKt__FilePathComponentsKt(path2));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static final boolean isRooted(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        if (getRootLength$FilesKt__FilePathComponentsKt(path) > 0) {
            return true;
        }
        return false;
    }

    public static final File subPath(File file, int i10, int i11) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return toComponents(file).subPath(i10, i11);
    }

    public static final FilePathComponents toComponents(File file) {
        boolean z10;
        List split$default;
        int collectionSizeOrDefault;
        List list;
        Intrinsics.checkNotNullParameter(file, "<this>");
        String path = file.getPath();
        Intrinsics.checkNotNull(path);
        int rootLength$FilesKt__FilePathComponentsKt = getRootLength$FilesKt__FilePathComponentsKt(path);
        String substring = path.substring(0, rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        String substring2 = path.substring(rootLength$FilesKt__FilePathComponentsKt);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        if (substring2.length() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            list = CollectionsKt.emptyList();
        } else {
            split$default = StringsKt__StringsKt.split$default(substring2, new char[]{File.separatorChar}, false, 0, 6, (Object) null);
            List list2 = split$default;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new FilePathComponents(new File(substring), list);
    }
}
