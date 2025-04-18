package androidx.compose.foundation.content.internal;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.core.view.DragAndDropPermissionsCompat;
import p0.a;

/* loaded from: classes2.dex */
public final class DragAndDropRequestPermission_androidKt {
    public static final void a(DelegatingNode delegatingNode, DragAndDropEvent dragAndDropEvent) {
        Activity activity;
        ClipData clipData = dragAndDropEvent.f14771a.getClipData();
        int itemCount = clipData.getItemCount();
        for (int i2 = 0; i2 < itemCount; i2++) {
            Uri uri = clipData.getItemAt(i2).getUri();
            if (uri != null && a.g(uri.getScheme(), "content")) {
                if (delegatingNode.f14688a.f14699n) {
                    Context context = DelegatableNode_androidKt.a(delegatingNode).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                            break;
                        } else {
                            if (context instanceof Activity) {
                                activity = (Activity) context;
                                break;
                            }
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity == null) {
                        return;
                    }
                    DragAndDropPermissionsCompat.a(activity, dragAndDropEvent.f14771a);
                    return;
                }
                return;
            }
        }
    }
}
