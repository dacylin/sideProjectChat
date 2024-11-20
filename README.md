# Side Project -- 留言板

## 專案概述：
設計並開發一個功能完善的留言系統，提供從使用者註冊、登入、留言管理到增刪改查 (CRUD) 操作的完整流程。系統採用分層架構設計，分離業務邏輯、數據訪問及界面層，提升系統的可讀性、可維護性及擴展性，以便未來進行功能擴充或進一步優化


## 使用技術
* 後端技術：Java / Spring Boot 3.2.3
* 資料層技術：MyBatis
* Database：MySQL
* 前端技術：Vue (Cli)

## 主要功能與技術細節：
*	用戶管理：使用者可進行註冊及登入，以確保登入權限及資料的私密性
* 資料庫操作：透過 MyBatis 進行資料庫訪問及操作，實現與 MySQL 資料庫的無縫整合，並進行數據持久化處理以確保留言數據的可靠性與一致性
* API 開發：基於 Spring Boot 框架，開發 RESTful API，支援前後端的數據傳輸及服務整合，確保留言內容的即時更新與頁面顯示的同步
