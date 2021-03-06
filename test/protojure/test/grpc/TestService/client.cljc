;;;----------------------------------------------------------------------------------
;;; Generated by protoc-gen-clojure.  DO NOT EDIT
;;;
;;; GRPC protojure.test.grpc.TestService Client Implementation
;;;----------------------------------------------------------------------------------
(ns protojure.test.grpc.TestService.client
  (:require [protojure.test.grpc :refer :all]
            [com.google.protobuf :as com.google.protobuf]
            [clojure.core.async :as async]
            [protojure.grpc.client.utils :refer [send-unary-params invoke-unary]]
            [promesa.core :as p]
            [protojure.grpc.client.api :as grpc]))

;-----------------------------------------------------------------------------
; GRPC Client Implementation
;-----------------------------------------------------------------------------

(defn CloseDetect
  [client params reply]
  (let [input (async/chan 1)
        desc {:service "protojure.test.grpc.TestService"
              :method  "CloseDetect"
              :input   {:f protojure.test.grpc/new-CloseDetectRequest :ch input}
              :output  {:f com.google.protobuf/pb->Any :ch reply}}]
    (-> (send-unary-params input params)
        (p/then (fn [_] (grpc/invoke client desc))))))

(defn FlowControl
  [client params reply]
  (let [input (async/chan 1)
        desc {:service "protojure.test.grpc.TestService"
              :method  "FlowControl"
              :input   {:f protojure.test.grpc/new-FlowControlRequest :ch input}
              :output  {:f protojure.test.grpc/pb->FlowControlPayload :ch reply}}]
    (-> (send-unary-params input params)
        (p/then (fn [_] (grpc/invoke client desc))))))

(defn Metadata
  [client params]
  (let [input (async/chan 1)
        output (async/chan 1)
        desc {:service "protojure.test.grpc.TestService"
              :method  "Metadata"
              :input   {:f com.google.protobuf/new-Empty :ch input}
              :output  {:f protojure.test.grpc/pb->SimpleResponse :ch output}}]
    (-> (send-unary-params input params)
        (p/then (fn [_] (invoke-unary client desc output))))))

(defn ShouldThrow
  [client params]
  (let [input (async/chan 1)
        output (async/chan 1)
        desc {:service "protojure.test.grpc.TestService"
              :method  "ShouldThrow"
              :input   {:f com.google.protobuf/new-Empty :ch input}
              :output  {:f com.google.protobuf/pb->Empty :ch output}}]
    (-> (send-unary-params input params)
        (p/then (fn [_] (invoke-unary client desc output))))))

(defn Async
  [client params]
  (let [input (async/chan 1)
        output (async/chan 1)
        desc {:service "protojure.test.grpc.TestService"
              :method  "Async"
              :input   {:f com.google.protobuf/new-Empty :ch input}
              :output  {:f protojure.test.grpc/pb->SimpleResponse :ch output}}]
    (-> (send-unary-params input params)
        (p/then (fn [_] (invoke-unary client desc output))))))

(defn AllEmpty
  [client params]
  (let [input (async/chan 1)
        output (async/chan 1)
        desc {:service "protojure.test.grpc.TestService"
              :method  "AllEmpty"
              :input   {:f com.google.protobuf/new-Empty :ch input}
              :output  {:f com.google.protobuf/pb->Empty :ch output}}]
    (-> (send-unary-params input params)
        (p/then (fn [_] (invoke-unary client desc output))))))

