package com.bumptech.glide;

import android.content.Context;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.RequestManagerRetriever;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.glority.android.picturexx.utils.GlideRequests;

/* loaded from: classes7.dex */
final class GeneratedRequestManagerFactory implements RequestManagerRetriever.RequestManagerFactory {
    @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
    public RequestManager build(Glide glide, Lifecycle lifecycle, RequestManagerTreeNode treeNode, Context context) {
        return new GlideRequests(glide, lifecycle, treeNode, context);
    }
}
