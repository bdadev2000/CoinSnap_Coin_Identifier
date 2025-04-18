package og;

import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.plantcare.ai.identifier.plantid.domains.FolderDomain;
import com.plantcare.ai.identifier.plantid.domains.ImageDomain;
import com.plantcare.ai.identifier.plantid.ui.component.plan_identifier.preview.PreviewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes4.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreviewModel f23333b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(PreviewModel previewModel, Continuation continuation) {
        super(2, continuation);
        this.f23333b = previewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f23333b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i10;
        boolean z10;
        int i11;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        PreviewModel previewModel = this.f23333b;
        int i12 = 1;
        previewModel.f16694l.postValue(Boxing.boxBoolean(true));
        ArrayList arrayList = previewModel.f16689g;
        arrayList.clear();
        ArrayList arrayList2 = previewModel.f16690h;
        arrayList2.clear();
        ArrayList arrayList3 = previewModel.f16691i;
        arrayList3.clear();
        Ref.IntRef intRef = new Ref.IntRef();
        Uri EXTERNAL_CONTENT_URI = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Intrinsics.checkNotNullExpressionValue(EXTERNAL_CONTENT_URI, "EXTERNAL_CONTENT_URI");
        Cursor query = previewModel.f16688f.getContentResolver().query(EXTERNAL_CONTENT_URI, new String[]{"_data", "bucket_display_name"}, null, null, "date_added DESC");
        if (query != null) {
            i10 = query.getColumnIndexOrThrow("_data");
        } else {
            i10 = 0;
        }
        if (query != null) {
            intRef.element = query.getColumnIndexOrThrow("bucket_display_name");
        }
        if (query != null) {
            int i13 = 0;
            int i14 = 0;
            while (query.moveToNext()) {
                String string = query.getString(i10);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                int size = arrayList.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size) {
                        break;
                    }
                    if (Intrinsics.areEqual(((FolderDomain) arrayList.get(i15)).getFolderName(), query.getString(intRef.element))) {
                        i14 = i12;
                        i13 = i15;
                        break;
                    }
                    i15++;
                    i14 = 0;
                }
                if (i14 != 0) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList4.addAll(((FolderDomain) arrayList.get(i13)).getImages());
                    File file = new File(string);
                    String string2 = query.getString(intRef.element);
                    if (string2 != null) {
                        String path = file.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                        Boxing.boxBoolean(arrayList4.add(new ImageDomain(path, string2, i12)));
                    }
                    ((FolderDomain) arrayList.get(i13)).setImages(arrayList4);
                    i11 = i12;
                } else {
                    ArrayList arrayList5 = new ArrayList();
                    File file2 = new File(string);
                    String string3 = query.getString(intRef.element);
                    if (string3 != null) {
                        String path2 = file2.getPath();
                        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
                        i11 = 1;
                        Boxing.boxBoolean(arrayList5.add(new ImageDomain(path2, string3, 1)));
                    } else {
                        i11 = i12;
                    }
                    if (query.getString(intRef.element) != null && query.getType(intRef.element) == 3) {
                        String string4 = query.getString(intRef.element);
                        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                        arrayList.add(new FolderDomain(string4, arrayList5));
                    }
                }
                i12 = i11;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                FolderDomain folderDomain = (FolderDomain) it.next();
                if (folderDomain.getImages().size() > 0) {
                    arrayList2.addAll(folderDomain.getImages());
                    arrayList3.addAll(folderDomain.getImages());
                }
            }
            FolderDomain folderDomain2 = new FolderDomain("All Images", arrayList3);
            z10 = false;
            arrayList.add(0, folderDomain2);
        } else {
            z10 = false;
        }
        previewModel.f16699q.postValue(arrayList2);
        previewModel.f16698p.postValue(arrayList);
        previewModel.f16694l.postValue(Boxing.boxBoolean(z10));
        return Unit.INSTANCE;
    }
}
