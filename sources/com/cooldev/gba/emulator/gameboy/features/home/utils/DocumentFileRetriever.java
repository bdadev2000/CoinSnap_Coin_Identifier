package com.cooldev.gba.emulator.gameboy.features.home.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.compose.runtime.internal.StabilityInferred;
import b1.f0;
import com.cooldev.gba.emulator.gameboy.features.home.models.BaseStorageFile;
import com.cooldev.gba.emulator.gameboy.features.home.models.GroupedStorageFiles;
import com.facebook.share.internal.ShareConstants;
import d0.k;
import e0.e0;
import e0.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DocumentFileRetriever {

    @NotNull
    public static final DocumentFileRetriever INSTANCE = new DocumentFileRetriever();

    @NotNull
    private static final Map<String, k> exceptionGame = e0.t(new k("C176FC59", new k("Radicorn: Riders of the Storm", "https://media.retroachievements.org/Images/092585.png")), new k("41EA5B0B", new k("Anguna: Warriors of Virtue", "https://s.pacn.ws/1/p/sk/anguna-warriors-of-virtue-514107.1.jpg?v=omus5u")));
    public static final int $stable = 8;

    private DocumentFileRetriever() {
    }

    private final Uri buildChildDocumentsUri(Uri uri) {
        Uri buildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri));
        a.r(buildChildDocumentsUriUsingTree, "buildChildDocumentsUriUsingTree(...)");
        return buildChildDocumentsUriUsingTree;
    }

    private final Uri buildDocumentUri(Uri uri, String str) {
        Uri buildDocumentUriUsingTree = DocumentsContract.buildDocumentUriUsingTree(uri, str);
        a.r(buildDocumentUriUsingTree, "buildDocumentUriUsingTree(...)");
        return buildDocumentUriUsingTree;
    }

    private final List<BaseStorageFile> sortedFilesForScanning(GroupedStorageFiles groupedStorageFiles) {
        return u.P0(f0.u(groupedStorageFiles.getPrimaryFile()), u.T0(groupedStorageFiles.getDataFiles(), new Comparator() { // from class: com.cooldev.gba.emulator.gameboy.features.home.utils.DocumentFileRetriever$sortedFilesForScanning$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return q.c(((BaseStorageFile) t2).getName(), ((BaseStorageFile) t3).getName());
            }
        }));
    }

    @NotNull
    public final List<BaseStorageFile> getFilesFromGBADirectory(@NotNull Context context) {
        a.s(context, "context");
        File file = new File(context.getExternalFilesDir(null), "GBA");
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                String name = file2.getName();
                a.r(name, "getName(...)");
                arrayList.add(new BaseStorageFile(name, file2.length(), Uri.fromFile(file2), file2.getAbsolutePath()));
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<BaseStorageFile> getFilesFromUri(@NotNull Context context, @NotNull Uri uri) {
        a.s(context, "context");
        a.s(uri, ShareConstants.MEDIA_URI);
        ArrayList arrayList = new ArrayList();
        Cursor query = context.getContentResolver().query(buildChildDocumentsUri(uri), new String[]{"document_id", "_display_name", "_size", "mime_type"}, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    long j2 = query.getLong(2);
                    DocumentFileRetriever documentFileRetriever = INSTANCE;
                    a.p(string);
                    Uri buildDocumentUri = documentFileRetriever.buildDocumentUri(uri, string);
                    a.p(string2);
                    arrayList.add(new BaseStorageFile(string2, j2, buildDocumentUri, buildDocumentUri.getPath()));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        q.b(query, th);
                        throw th2;
                    }
                }
            }
            q.b(query, null);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0151 -> B:10:0x015a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00b4 -> B:28:0x00c3). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object parseAndFetchGames(@org.jetbrains.annotations.NotNull android.content.Context r27, @org.jetbrains.annotations.NotNull java.util.List<com.cooldev.gba.emulator.gameboy.features.home.models.BaseStorageFile> r28, @org.jetbrains.annotations.NotNull h0.g r29) {
        /*
            Method dump skipped, instructions count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.home.utils.DocumentFileRetriever.parseAndFetchGames(android.content.Context, java.util.List, h0.g):java.lang.Object");
    }
}
