(function() {
    if (window.chromium) {
        return;
    }

    var messagingIframe;
    var bizMessagingIframe;
    var postMessageQueue = [];
    var receiveMessageQueue = [];
    var messageHandlers = {};

    var SCHEME = 'androidjsbridge';
    var QUEUE_HAS_MESSAGE = '__QUEUE_MESSAGE__/';

    var responseCallbacks = {};
    var uniqueId = 1;

    function _createQueueReadyIframe(doc) {
        messagingIframe = doc.createElement('iframe');
        messagingIframe.style.display = 'none';
        doc.documentElement.appendChild(messagingIframe);
    }

    function _createQueueReadyIframe4biz(doc) {
        bizMessagingIframe = doc.createElement('iframe');
        bizMessagingIframe.style.display = 'none';
        doc.documentElement.appendChild(bizMessagingIframe);
    }

    function defaultHandler(messageHandler) {
        if (chromium._defaultHandler) {
            throw new Error('ERROR: defaultHandler');
        }
        chromium._defaultHandler = messageHandler;
        var receivedMessages = receiveMessageQueue;
        receiveMessageQueue = null;
        for (var i = 0; i < receivedMessages.length; i++) {
            _dispatchMessageFromNative(receivedMessages[i]);
        }
    }

    function postMessage(data, responseCallback) {
        _doPostMessage({
            data: data
        }, responseCallback);
    }

    function registerHandler(handlerName, handler) {
        messageHandlers[handlerName] = handler;
    }

    function postNamedMessage(handlerName, data, responseCallback) {
        _doPostMessage({
            handlerName: handlerName,
            data: data
        }, responseCallback);
    }

    function _doPostMessage(message, responseCallback) {
        if (responseCallback) {
            var callbackId = 'js_cb_' + (uniqueId++) + '_' + new Date().getTime();
            responseCallbacks[callbackId] = responseCallback;
            message.callbackId = callbackId;
        }

        postMessageQueue.push(message);
        messagingIframe.src = SCHEME + '://' + QUEUE_HAS_MESSAGE;
    }

    function _fetchQueue() {
        var messageQueueString = JSON.stringify(postMessageQueue);
        postMessageQueue = [];
        if (messageQueueString !== '[]') {
            bizMessagingIframe.src = SCHEME + '://return/_fetchQueue/' + encodeURIComponent(messageQueueString);
        }
    }

    function _dispatchMessageFromNative(messageJSON) {
        setTimeout(function() {
            var message = JSON.parse(messageJSON);
            var responseCallback;
            if (message.responseId) {
                responseCallback = responseCallbacks[message.responseId];
                if (!responseCallback) {
                    return;
                }
                responseCallback(message.responseData);
                delete responseCallbacks[message.responseId];
            } else {
                if (message.callbackId) {
                    var callbackResponseId = message.callbackId;
                    responseCallback = function(responseData) {
                        _doPostMessage({
                            responseId: callbackResponseId,
                            responseData: responseData
                        });
                    };
                }

                var handler = chromium._defaultHandler;
                if (message.handlerName) {
                    handler = messageHandlers[message.handlerName];
                }
                try {
                    handler(message.data, responseCallback);
                } catch (exception) {
                    if (typeof console != 'undefined') {
                        console.log("ERROR: ", message, exception);
                    }
                }
            }
        });
    }

    function _handleMessageFromNative(messageJSON) {
        console.log(messageJSON);
        if (receiveMessageQueue) {
            receiveMessageQueue.push(messageJSON);
        }
        _dispatchMessageFromNative(messageJSON);
       
    }

    var chromium = window.chromium = {
        defaultHandler: defaultHandler,
        registerHandler: registerHandler,
        postMessage: postMessage,
        postNamedMessage: postNamedMessage,
        _fetchQueue: _fetchQueue,
        _handleMessageFromNative: _handleMessageFromNative
    };

    var doc = document;
    _createQueueReadyIframe(doc);
    _createQueueReadyIframe4biz(doc);
    var readyEvent = doc.createEvent('Events');
    readyEvent.initEvent('chromiumReady');
    readyEvent.bridge = chromium;
    doc.dispatchEvent(readyEvent);
})();
